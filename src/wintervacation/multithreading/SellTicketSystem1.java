package wintervacation.multithreading;

/**
 * Created by wangw on 2016/3/2.
 * 用实现Runnable接口的方式模拟火车票售票系统，与继承Thread的方式作比较
 * 假设四个系统同时出售某一车次的100张车票
 */
public class SellTicketSystem1 {
    public static void main(String[] args) {
        MyThread thread = new MyThread();
        Thread myThread0 = new Thread(thread);
        myThread0.start();
        Thread myThread1 = new Thread(thread);
        myThread1.start();
        Thread myThread2 = new Thread(thread);
        myThread2.start();
        Thread myThread3 = new Thread(thread);
        myThread3.start();
    }

    static class MyThread implements Runnable {
        private int ticket = 100;

        @Override
        public void run() {
            while (true) {
//                synchronized ("haha") {
//                    if(ticket>0) {
//                        try {
//                            Thread.sleep(100);
//                        } catch (InterruptedException e) {
//                            e.printStackTrace();
//                        }
//                        System.out.println(Thread.currentThread().getName() + " sell out ticket" + ticket--);
//                    }
//                    else
//                        break;
//                }
                sell();
                if (ticket <= 0)
                    break;
            }
        }

        public synchronized void sell() {
            if (ticket > 0) {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName() + " sell out ticket" + ticket--);
            }
        }
    }
}


