package wintervacation.multithreading;

/**
 * Created by wangw on 2016/3/2.
 * 用于演示Thread的优先级，高优先级线程的执行优先于低优先级线程
 */
public class ThreadPriority {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("最高优先级："+Thread.MAX_PRIORITY);
        System.out.println("最低优先级："+Thread.MIN_PRIORITY);
        System.out.println("默认优先级："+Thread.NORM_PRIORITY);

        MyThread thread0 = new MyThread();
        thread0.setPriority(Thread.MAX_PRIORITY);
        thread0.start();

        MyThread thread1 = new MyThread();
        thread1.setPriority(Thread.MIN_PRIORITY);
        thread1.start();

        MyThread thread2 = new MyThread();
        thread2.setPriority(Thread.NORM_PRIORITY);
        thread2.start();

//        join方法：当前线程执行某一线程的join方法之后，当前线程等到该线程执行结束之后才能执行
//        thread1.join();
        for(int i=0;i<50;i++)
        {
            System.out.println(Thread.currentThread().getName()+" is running-------"+i);
        }
        System.out.println(Thread.currentThread().getName()+"is over");

    }
    static class MyThread extends Thread
    {
        @Override
        public void run() {
            for(int i=0;i<50;i++)
            {
                System.out.println(Thread.currentThread().getName()+" is running-------"+i);
            }
            System.out.println(Thread.currentThread().getName()+"is over");
        }
    }
}
