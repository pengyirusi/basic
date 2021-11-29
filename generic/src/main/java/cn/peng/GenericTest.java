package cn.peng;

import java.util.ArrayList;
import java.util.List;

/**
 * @author weiyupeng
 * @create 2021/11/29 21:47
 */
public class GenericTest {
    public static void main(String[] args) {
        test1();
    }

    /**
     * 在集合中使用泛型之前
     */
    private static void test1() {
        List list = new ArrayList();

        list.add(1);
        list.add("s");

        for (Object o : list) {
            System.out.println(o);
        }
    }
}
