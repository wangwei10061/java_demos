package wintervacation.multithreading;

/**
 * Created by wangw on 2016/3/2.
 * 线程的stop方法已经被废弃了，那么怎么停止一个线程呢，
 * 我们可以通过给它设置一个标志变量来实现
 */
public class StopThreadDemo {
    public static void main(String[] args) {
        MyThread thread = new MyThread();
        thread.setPriority(Thread.MAX_PRIORITY);
        thread.start();

        for(int i=0;i<50;i++)
        {
            System.out.println(Thread.currentThread().getName()+" is running-------"+i);
        }
        thread.shutdown();
        System.out.println(Thread.currentThread().getName()+"is over");
    }

    static class MyThread extends Thread
    {
        private boolean flag = false;
        @Override
        public void run() {
            int i = 0;
            while(true)
            {
                if(flag)
                    break;
                System.out.println(this.getName()+":"+i++);
            }
            System.out.println(this.getName()+" is over");
        }

        public void shutdown()
        {
            flag = true;
        }

    }
}
