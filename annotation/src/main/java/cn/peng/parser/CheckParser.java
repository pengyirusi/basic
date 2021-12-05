package cn.peng.parser;

import cn.peng.annotation.Check;

import java.lang.annotation.Annotation;

/**
 * @author weiyupeng
 * @create 2021/12/5 14:36
 */
public class CheckParser {
    public void parse(Class clz) {
        //获取Check的注解对象
        Annotation annotation = clz.getAnnotation(Check.class);
        Check check = (Check) annotation;

        //检查是否有Check注解，并且注解的value属性为true
        if (check != null && check.value()) {
            System.out.println(clz.getName() + " must check");
        } else {
            System.out.println(clz.getName() + " no need to check");
        }
    }
}
