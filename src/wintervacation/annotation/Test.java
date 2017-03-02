package wintervacation.annotation;

/**
 * Created by wangw on 2016/1/28.
 */
public class Test {
    private static SQLGenerator sqlGenerator = new SQLGenerator();
    public static void main(String[] args)
    {
        User zhangsan = new User();
        zhangsan.setName("zhangsan");
        zhangsan.setAge(10);
        String sql = sqlGenerator.query(zhangsan);
        System.out.println(sql);
    }

}
