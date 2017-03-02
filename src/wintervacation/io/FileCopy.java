package wintervacation.io;
import java.io.*;
/**
 * Created by wangw on 2016/1/27.
 * 复制一个文本文件
 */
public class FileCopy {
    public static void main(String[] args)
    {
        copy("D:\\IdeaProjects\\WinterVactionExcercises\\src\\wintervacation\\io\\FileCopy.java",
                "D:\\IdeaProjects\\WinterVactionExcercises\\FileCopy.txt");
    }

    /**
     * 拷贝文件
     * @param sourcePath 源文件的路径，按windows的路径格式
     * @param destination 目的地址，按windows的路径格式
     */
    public static void copy(String sourcePath,String destination)
    {
//        //对路径进行一下处理\变成\\,idea这个复制过来就自动解决了，真屌
//        sourcePath = sourcePath.replaceAll("\\\\", "\\");
//        destination = destination.replaceAll("\\\\", "\\");

        //建立读文件的读入流
        FileReader fr = null;
        FileWriter fw = null;

        try {
            fr = new FileReader(sourcePath);
            fw = new FileWriter(destination);

            //创建一个缓冲区
            char[] buf = new char[1024];

            //当尚未读到文件的末尾时，就读取源文件的内容写入目标文件中
            int num = 0;
            while ((num=fr.read(buf))!=-1) {
                fw.write(new String(buf,0,num));
                fw.flush();
            }
        }catch (IOException e)
        {
            throw new RuntimeException("复制异常");
        }
        finally {
            if(fr==null)
                try {
                    fr.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            if(fw==null)
                try {
                    fw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
        }


    }


}
