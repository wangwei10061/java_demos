package wintervacation.io;

import java.io.*;

/**
 * Created by wangw on 2016/1/27.
 * 文件复制，加入了缓冲区机制
 */
public class BufferedFileCopy {
    public static void main(String[] args)
    {
        copy("D:\\IdeaProjects\\WinterVactionExcercises\\src\\wintervacation\\io\\BufferedFileCopy.java",
                "D:\\IdeaProjects\\WinterVactionExcercises\\BufferedFileCopy.txt");
    }
    /**
     * 拷贝文件
     * @param sourcePath 源文件的路径，按windows的路径格式
     * @param destination 目的地址，按windows的路径格式
     */
    public static void copy(String sourcePath,String destination)
    {

        BufferedWriter bw = null;
        BufferedReader br = null;

        try {
            //建立缓冲区，与相应的输入输出流相绑定
            bw = new BufferedWriter(new FileWriter(destination));
            br = new BufferedReader(new FileReader(sourcePath));

            //循环按行读取数据
            String line = null;
            while((line = br.readLine())!=null)
            {
                bw.write(line);
                bw.newLine();
                bw.flush();
            }
        }catch (IOException e)
        {
            throw new RuntimeException("复制异常");
        }
        finally {
            if(br==null)
                try {
                    br.close();
                } catch (IOException e) {
                    throw new RuntimeException("复制异常");
                }
            if(bw==null)
                try {
                    bw.close();
                } catch (IOException e) {
                    throw new RuntimeException("复制异常");
                }

        }


    }


}
