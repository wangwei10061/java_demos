package wintervacation.multithreading;

/**
 * Created by wangw on 2016/3/2.
 * 死锁的例子
 */
public class DeadLockDemo {
    public static void main(String[] args) throws InterruptedException {
        StringBuffer sb = new StringBuffer("haha");
        MyThread thread = new MyThread(sb);
        thread.start();

        synchronized (sb)
        {
            thread.join();
            System.out.println(Thread.currentThread().getName());
        }
    }

    static class MyThread extends Thread
    {
        private StringBuffer sb = new StringBuffer();
        MyThread(StringBuffer sb)
        {
            this.sb = sb;
        }
        @Override
        public void run() {
            synchronized (sb)
            {
                System.out.println(this.getName());
            }
        }

    }
}
