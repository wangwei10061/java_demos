package wintervacation.io;

import java.io.*;

/**
 * 复制一个mp3文件
 * Created by wangw on 2016/2/2.
 */
public class CopyMp3 {
    public static void main(String[] args) throws IOException {
        plainCopyMethod();
        bufferedCopyMethod();
    }

    //用Buffered对象操作
    public static void bufferedCopyMethod() throws IOException
    {
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("BEYOND - 喜欢你.mp3"));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("喜欢你_副本2.mp3"));

        int num = 0;
        while((num = bis.read())!=-1)
        {
            bos.write(num);
        }

        bis.close();
        bos.close();
    }
    //没有用到BufferedInputStream，BufferedOutputStream包装类
    public static void plainCopyMethod() {
        FileInputStream fis = null;
        FileOutputStream fos = null;
        try {
            fis = new FileInputStream("BEYOND - 喜欢你.mp3");
            fos = new FileOutputStream("喜欢你_副本.mp3");

            byte[] buf = new byte[1024];
            int len = 0;
            while ((len = fis.read(buf)) != -1) {
                fos.write(buf, 0, len);
            }
        } catch (IOException e) {
//            e.printStackTrace();
            throw new RuntimeException("复制出错");
        } finally {
            if (fis!=null)
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            if(fos!=null)
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
        }
    }
}
