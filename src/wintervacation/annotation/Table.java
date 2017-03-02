package wintervacation.annotation;

import java.lang.annotation.*;

/**
 * Created by wangw on 2016/1/28.
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Inherited
@Documented
public @interface Table
{
    String value();
}

