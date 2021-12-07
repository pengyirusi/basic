package java8.defaultMethod;

/**
 * @author weiyupeng
 * @create 2021/12/7 22:10
 */
public interface Cat {
    default void say() {
        System.out.println("miao");
    }
}
