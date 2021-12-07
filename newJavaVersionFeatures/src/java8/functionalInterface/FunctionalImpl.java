package java8.functionalInterface;

/**
 * @author weiyupeng
 * @create 2021/12/6 22:21
 */
public class FunctionalImpl implements Functional{
    @Override
    public int add(int a, int b) {
        return a + b;
    }

    @Override
    public int sum(int a, int b) {
        return Functional.super.sum(a, b);
    }

    public static void main(String[] args) {
        FunctionalImpl functionalImpl = new FunctionalImpl();
        System.out.println(functionalImpl.add(1, 2));
        System.out.println(functionalImpl.sum(1, 2));
    }
}

