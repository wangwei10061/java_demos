package wintervacation.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 字节流用法的简单演示
 * Created by wangw on 2016/2/2.
 */
public class InputOutputStreamDemo {
    public static void main(String[] args) throws IOException {
        outputStreamWrite();
        inputStreamRead_1();
        inputStreamRead_2();
        inputStreamRead_3();
    }

    //FileOutputStream写一个文件
    public static void outputStreamWrite() throws IOException {
        FileOutputStream fos = new FileOutputStream("fos.txt");
        fos.write("haha".getBytes());
        //此处不需要flush，因为直接操作的字节数据，没有缓冲
        fos.close();
    }
    //FileInputStream读一个文件
    public static void inputStreamRead_1() throws IOException
    {
        FileInputStream fis = new FileInputStream("fos.txt");
        int num = 0;
        while((num = fis.read())!=-1)
        {
            System.out.println((char)num);
        }
        fis.close();
    }
    public static void inputStreamRead_2() throws IOException
    {
        FileInputStream fis = new FileInputStream("fos.txt");
        byte[] buf = new byte[1024];
        int len = 0;
        while((len = fis.read(buf))!=-1)
        {
            System.out.println(new String(buf,0,len));
        }
        fis.close();
    }
    public static void inputStreamRead_3() throws IOException
    {
        FileInputStream fis = new FileInputStream("fos.txt");
        //字节流特有的方法，返回剩余的字节数
        byte[] buf = new byte[fis.available()];
        fis.read(buf);
        System.out.println(new String(buf));
        fis.close();

    }

}
