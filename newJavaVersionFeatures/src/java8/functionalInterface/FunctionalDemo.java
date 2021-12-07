package java8.functionalInterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/**
 * @author weiyupeng
 * @create 2021/12/7 21:24
 */
public class FunctionalDemo {
    private static Functional functional = (a, b) -> a + b;
    private static Functional2 functional2 = a -> System.out.println(a * 2);

    public static void main(String[] args) {
        int add = functional.add(1, 2);
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.forEach(functional2::printX2);
    }
}
