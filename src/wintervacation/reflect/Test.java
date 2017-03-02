package wintervacation.reflect;

/**
 * Created by wangw on 2016/1/25.
 * 根据控制台的输入来启动office组件
 */
public class Test {
    public static void main(String[] args)
    {
       /* //启动Word
        if(args[0].equals("Word"))
        {
            Word word = new Word();
            word.start();
        }
        //启动Excel
        if(args[0].equals("Excel"))
        {
            Excel excel = new Excel();
            excel.start();
        }

        //...*/

        try {
            Class clazz = Class.forName(args[0]);
            OfficeAble oa = (OfficeAble) clazz.newInstance();
            oa.start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
