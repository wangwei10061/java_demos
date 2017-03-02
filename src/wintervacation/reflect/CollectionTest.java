package wintervacation.reflect;

import java.util.ArrayList;
import java.lang.reflect.*;
/**
 * Created by wangw on 2016/1/25.
 */
public class CollectionTest {
    public static void main(String[] args)
    {
        ArrayList list = new ArrayList();
        ArrayList<String> list1 = new ArrayList<>();
        Class clazz = list.getClass();
        Class clazz1 = list1.getClass();

        //看泛型化后的ArrayList与原始的ArrayList的类类型是否是一样的
        System.out.println(clazz==clazz1);

        list1.add("haha");
        //这样是无法编译通过的
//        list1.add(1);
        //下面通过反射的方式来调用add方法把1加入list1中
        try {
            //方法获取，参数为由方法名和原参数类型列表组成
            Method method = clazz1.getDeclaredMethod("add",Object.class);
            //方法调用，参数为待操作对象和原方法参数
            method.invoke(list1,1);
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println(list1);
    }
}
