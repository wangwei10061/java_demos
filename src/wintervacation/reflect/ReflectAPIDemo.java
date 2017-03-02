package wintervacation.reflect;

import java.lang.reflect.*;

/**
 * Created by wangw on 2016/1/25.
 * 演示反射常用的API
 */
public class ReflectAPIDemo {
    public static void main(String[] args)
    {
//        printDeclaredFields("hello");
//        printDeclaredMethods("nihao");
        printDeclaredConstructors(new Integer(1));
    }

    /**
     * 获取成员变量的信息
     * @param o 待获取信息的类的对象
     */
    public static void printDeclaredFields(Object o)
    {
        //拿到对应的类类型
        Class clazz = o.getClass();

        Field[] fields = clazz.getDeclaredFields();
        for(Field field:fields)
        {
            System.out.print(field.getType()+" ");
            System.out.println(field.getName());
        }
    }

    /**
     * 获取普通方法的信息
     * @param o 待获取信息的类的对象
     */
    public static void printDeclaredMethods(Object o)
    {
        Class clazz = o.getClass();

//        //获取所有的public方法，包括从父类继承下来的
//        Method[] methods = clazz.getMethods();
        //获取本类声明的所有方法，包括私有的
        Method[] methods = clazz.getDeclaredMethods();
        for(Method method:methods)
        {
//            System.out.print(method.getReturnType()+" ");
//            System.out.print(method.getName()+"(");
//
//            //获取参数列表
//            Class[] parameters = method.getParameterTypes();
//            for (Class temp:parameters)
//            {
//                System.out.print(temp.getName()+",");
//            }
//            System.out.println(")");
            System.out.println(method);
        }
    }

    /**
     * 获取构造方法的信息
     * @param o 待获取信息的类的对象
     */
    public static void printDeclaredConstructors(Object o)
    {
        Class clazz = o.getClass();

        Constructor[] constructors = clazz.getConstructors();
        for(Constructor constructor:constructors)
        {
            System.out.print(constructor.getName()+"(");

            Class[] parameters = constructor.getParameterTypes();
            for (Class temp:parameters)
            {
                System.out.print(temp.getName()+",");
            }
            System.out.println(")");
        }
    }
}
