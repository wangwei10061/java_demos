package wintervacation.collections;

/**
 * Created by wangw on 2016/3/8.
 * 泛型类的简单例子
 */
public class GenericClass<T> {
    private T first;
    private T second;

    public GenericClass() {
        first = null;
        second = null;
    }

    public GenericClass(T first, T second) {
        this.first = first;
        this.second = second;
    }



    public T getSecond() {
        return second;
    }

    public void setSecond(T second) {
        this.second = second;
    }

    public T getFirst() {
        return first;
    }

    public void setFirst(T first) {
        this.first = first;
    }

    /**
     * 下面的四个方法：
     * public <T> T getMiddle(T[] a)和public  T getMiddle(T[] a)有什么区别？
     * 为什么public static <T> T getMiddle(T[] a)可以编译通过，而public static T getMiddle(T[] a)不能编译通过
     */
    public <T> T getMiddle(T[] a) {
        return a[a.length / 2];
    }
    //    public static <T> T getMiddle(T[] a)
    //    {
    //        return a[a.length/2];
    //    }
    //    public  T getMiddle(T[] a)
    //    {
    //        return a[a.length/2];
    //    }
    //    public static T getMiddle(T[] a) {
    //        return a[a.length / 2];
    //    }
    public static void main(String[] args) {
        GenericClass<String> haha = new GenericClass("first", "second");
    }
}
