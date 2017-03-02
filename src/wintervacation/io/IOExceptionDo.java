package wintervacation.io;
import java.io.*;

/**
 * Created by wangw on 2016/1/27.
 * 演示IO异常的标准处理
 * a.try catch处理，并最终释放空间，在释放空间时同样try catch 捕获异常
 * b.try catch代码块外部建立引用
 * c.关闭之前判断fw是否为空
 */

class IOEXceptionDo
{
    public static void main(String[] args)
    {
        //try catch代码块外部建立引用
        FileWriter fw = null;

        try
        {
            //引用与创建的对象进行绑定
            fw = new FileWriter("demo.wangwei");

            fw.write("hahaha");
        }
        catch (IOException e)
        {
            System.out.println(e.toString());
        }
        finally
        {
            try
            {
                //判断fw是否为空
                if(fw!=null)
                    fw.close();
            }
            catch (IOException e)
            {
                System.out.println(e.toString());
            }

        }
    }
}