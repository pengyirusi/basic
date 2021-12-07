package java8.functionalInterface;

/**
 * @author weiyupeng
 * @create 2021/12/6 22:22
 */
@FunctionalInterface// 只能有一个待实现的函数，默认实现的函数不算
public interface Functional {
    int add(int a, int b);

    // 默认实现的函数不算
    default int sum(int a, int b) {
        return a + b;
    }
}
