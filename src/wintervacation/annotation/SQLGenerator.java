package wintervacation.annotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * Created by wangw on 2016/1/28.
 * 通过注解和反射技术来根据条件拼接查询语句
 */
public class SQLGenerator {
    public String query(Object j)
    {
        StringBuilder sb = new StringBuilder();

        //先通过反射获取表名
        Class c = j.getClass();
        //判断是否存在对应的注解
        boolean isTablePresent = c.isAnnotationPresent(Table.class);
        if(!isTablePresent)
            return null;
        //拿到对应的注解对象
        Table table = (Table)c.getAnnotation(Table.class);
        String tableValue = table.value();
        sb.append("select * from ").append(tableValue).append(" where 1=1 ");

        //然后通过反射机制获取字段名和值
        Field[] fields = c.getDeclaredFields();
        for(Field field:fields)
        {
            boolean isFieldPresent = field.isAnnotationPresent(Column.class);
            if(!isFieldPresent)
                continue;
            else {
                Column column = field.getAnnotation(Column.class);

                //获取到了字段名
                String fieldName = column.value();

                //通过get方法获取对应字段的值
                String getFunName = "get"+fieldName.substring(0,1).toUpperCase()+fieldName.substring(1);
                try {
                    Method getMethod = c.getDeclaredMethod(getFunName);
                    Object o = getMethod.invoke(j);
                    //假如字段尚未赋值
                    if(o == null|| (o instanceof Integer&& ((Integer) o).intValue()==0))
                        continue;
                    //假如字段的类型是字符串
                    if(o instanceof String)
                    {
                        sb.append("and ").append(fieldName).append(" = ‘");
                        sb.append(o.toString()).append("' ");
                    }
                    //否则的话
                    else
                        sb.append("and ").append(fieldName).append(" = ").append(o.toString()).append(" ");


                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
        return sb.toString();
    }

}
