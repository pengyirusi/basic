package cn.peng.annotation;

import java.lang.annotation.*;

/**
 * @author weiyupeng
 * @create 2021/12/5 14:34
 */
@Target({ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Inherited
@Documented
public @interface Check {
    boolean value() default false;
}
