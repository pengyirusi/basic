package java8.lambda;

/**
 * @author weiyupeng
 * @create 2021/12/6 22:21
 */
public class Lambda2 implements Functional{
    @Override
    public int add(int a, int b) {
        return a + b;
    }

    @Override
    public int sum(int a, int b) {
        return Functional.super.sum(a, b);
    }

    public static void main(String[] args) {
        Lambda2 lambda2 = new Lambda2();
        System.out.println(lambda2.add(1, 2));
        System.out.println(lambda2.sum(1, 2));
    }

    /**
     * !!!明天继续！！！
     */

    //https://www.cnblogs.com/xingzc/p/6002873.html
}

