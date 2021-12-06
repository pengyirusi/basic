package java8.lambda;

import java.security.PrivilegedAction;
import java.util.Arrays;
import java.util.Comparator;
import java.util.function.*;

/**
 * @author weiyupeng
 * @create 2021/12/6 21:31
 * Lambda 表达式
 */
public class Lambda {
    /**
     * 语法：(parameters) -> { statements; }
     * 特征：
     * 1.可选类型声明：不需要声明参数类型，编译器可以统一识别参数值。
     * 2.可选的参数圆括号：一个参数无需定义圆括号，但多个参数需要定义圆括号。
     * 3.可选的大括号：如果主体包含了一个语句，就不需要使用大括号。
     * 4.可选的返回关键字：如果主体只有一个表达式返回值则编译器会自动返回值，大括号需要指定表达式返回了一个数值。
     */

    private void test1() {
        PrivilegedAction<Integer> integerPrivilegedAction = () -> 5;
        System.out.println(integerPrivilegedAction.run());

        LongFunction<Long> longLongFunction = (long x) -> x + 2;
        System.out.println(longLongFunction.apply(5));

        LongToDoubleFunction longToDoubleFunction = (long x) -> x * 2;
        System.out.println(longToDoubleFunction.applyAsDouble(2));


        Consumer<String> stringConsumer = (String s) -> System.out.println(s);
        stringConsumer.accept("hello lambda");

        IntBinaryOperator intBinaryOperator = Integer::sum;
        //(int a, int b) -> a + b;
        //Integer::里有一堆操作
        System.out.println(intBinaryOperator.applyAsInt(1, 2));

        Print print = (String name) -> "hello, " + name;
        System.out.println(print.myPrint("weiyupeng!"));
    }

    interface Print {
        String myPrint(String str);
    }

    private void test2() {
        Arrays.asList(1,2,3).forEach(e -> System.out.println(e * 2));
        Arrays.asList("a","b","c").sort((a,b)->{
            return b.compareTo(a);
        });
        // 等同于👇
        Arrays.asList("a","b","c").sort(Comparator.reverseOrder());
    }

    public static void main(String[] args) {
        new Lambda().test1();

        Runnable test = new Lambda()::test2;
        test.run();
    }
}
