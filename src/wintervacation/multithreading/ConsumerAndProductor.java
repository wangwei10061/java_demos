package wintervacation.multithreading;

/**
 * Created by wangw on 2016/3/2.
 * 消费者和生产者的例子，用于说明线程之间的通信
 * 把生产者和消费者作为两个线程
 * 仓库作为一个类，有装入生产者生产的商品和向消费者提供商品两个方法
 */
public class ConsumerAndProductor {
    public static void main(String[] args) {
        Repo repo = new Repo();
        ComsumerThread comsumerThread = new ComsumerThread(repo);
        comsumerThread.start();
        ProductorThread productorThread = new ProductorThread(repo);
        productorThread.start();
    }
}

class Repo {
    //仓库可以容纳6件商品
    char[] data = new char[6];
    int index = 0;

    public synchronized void in(char c) {
        if (index == 6) {
            try {
                this.wait();
                System.out.println("-----" + this);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        data[index++] = c;
        System.out.println("生产了产品" + c);
        this.notify();
    }

    public synchronized char out() {
        if (index == 0) {
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        index--;
        System.out.println("消费了产品" + data[index]);
        this.notify();
        return data[index];
    }
}

class ComsumerThread extends Thread {
    Repo repo;

    ComsumerThread(Repo repo) {
        this.repo = repo;
    }

    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            char c = (char) (Math.random() * 26 + 'A');
            repo.in(c);
            try {
                Thread.sleep((int) (Math.random() * 10));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class ProductorThread extends Thread {
    Repo repo;

    ProductorThread(Repo repo) {
        this.repo = repo;
    }

    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            repo.out();
            try {
                Thread.sleep((int) (Math.random() * 100));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}