package wintervacation.io;
import java.io.*;

/**
 * Created by wangw on 2016/1/27.
 * 演示字符流中的FileWriter的用法
 */

class  FileWriterDemo
{
    public static void main(String[] args) throws IOException
    {
        //在创建FileWriter对象时就必须明确它要操作的文件
        //若目标目录下存在同名的文件，将覆盖该文件
        FileWriter fw = new FileWriter("demo.txt");
        //在文件末尾添加数据，不覆盖源文件
        //FileWriter fw = new FileWriter("demo.txt",true);

        //向流中写入数据
        fw.write("haha");

        //将流中数据刷入指定文件中
        fw.flush();

        // fw.write(" i  \nds sd ");  //？\n不起作用，因为在Windows中换行用\r\n表示
        fw.write(" i \r \nds sd ");
        //关闭流。 在流关闭之前会调用一次flush()方法将流中数据写入指定文件
        fw.close();

    }
}