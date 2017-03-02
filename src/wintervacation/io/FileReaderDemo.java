package wintervacation.io;
import java.io.*;
/**
 * Created by wangw on 2016/1/27.
 */
class FileReaderDemo
{
    public static void main(String[] args) throws IOException
    {
        //建立一个FileReader对象读取指定文件中的内容
        FileReader fr = new FileReader("demo.wangwei");
        int num = 0;
        /*
          //每次读取一个字符，以int值形式返回
          while((num = fr.read())!=-1)
          {
           System.out.print((char)num);
          }
        */
        //每次读取的值存在一个字符数组中
        char [] buf = new char[1024];
        while( (num=fr.read(buf))!=-1)
        {
            System.out.print(new String(buf,0,num));
        }
        fr.close();
    }
}