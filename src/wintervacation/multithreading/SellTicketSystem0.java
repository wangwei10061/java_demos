package wintervacation.multithreading;

/**
 * Created by wangw on 2016/3/2.
 * 用继承Thread的方式模拟火车票售票系统，与实现Runnable接口的方式作比较
 * 假设四个系统同时出售某一车次的100张车票
 */
public class SellTicketSystem0 {
    public static void main(String[] args) {
        MyThread myThread0 = new MyThread();
        myThread0.start();
        MyThread myThread1 = new MyThread();
        myThread1.start();
        MyThread myThread2 = new MyThread();
        myThread2.start();
        MyThread myThread3 = new MyThread();
        myThread3.start();

    }
}
class MyThread extends Thread
{
    private int ticket = 100;
    @Override
    public void run() {
        while(ticket>0)
            System.out.println(this.getName()+" sell out ticket" + ticket--);
    }
}
