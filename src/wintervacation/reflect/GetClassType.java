package wintervacation.reflect;

/**
 * Created by wangw on 2016/1/25.
 */
public class GetClassType {
    public static void main(String args[])
    {
        Class clazz = null;
        //获取某个类的类类型的三种方式
        try {
            //1.通过Class类的forName方法
             clazz = Class.forName("wintervacation.reflect.Test");
            System.out.println(clazz.getName());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        //2.通过类名.class获取
        Class clazz1 = Test.class;
        System.out.println(clazz1.getPackage());

        //3.通过对象.getClass()方法获取
        Test test = new Test();
        Class clazz2 = test.getClass();

        System.out.println(clazz1==clazz2);
        System.out.println(clazz==clazz2);
    }
}
