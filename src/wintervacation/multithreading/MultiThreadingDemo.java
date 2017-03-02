package wintervacation.multithreading;

/**
 * Created by wangw on 2016/3/2.
 * 演示创建多线程的两种方式：
 * a.继承Thread类
 * b.实现Runnable接口
 */
public class MultiThreadingDemo {
    public static void main(String[] args)
    {
        MyThread0 thread0 = new MyThread0();
        thread0.start();

        /*
        myThread1不能作为线程启动运行，必须包装在Thread对象thread1中
        但是thread1启动运行的线程是myThread1，执行的线程体也是myThread1的
         */
        MyThread1 myThread1 = new MyThread1();
        Thread thread1 = new Thread(myThread1);
        thread1.start();

        for(int i=0;i<500;i++)
        {
            System.out.println(Thread.currentThread().getName()+" is running-------"+i);
        }
        System.out.println(Thread.currentThread().getName()+"is over");

    }

    //方式1：继承Thread类
    static class MyThread0 extends Thread
    {
        @Override
        public void run() {
            for(int i=0;i<500;i++)
            {
                System.out.println(Thread.currentThread().getName()+" is running-------"+i);
            }
            System.out.println(Thread.currentThread().getName()+"is over");
        }
    }

    //方式2:实现Runnable接口
    static class MyThread1 implements Runnable
    {
        @Override
        public void run() {
            for(int i=0;i<500;i++)
            {
                System.out.println(Thread.currentThread().getName()+" is running-------"+i);
            }
            System.out.println(Thread.currentThread().getName()+"is over");
        }
    }

}
