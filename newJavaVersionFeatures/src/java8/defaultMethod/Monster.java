package java8.defaultMethod;

/**
 * @author weiyupeng
 * @create 2021/12/7 22:11
 * 默认方法
 */
public class Monster implements Cat, Dog{
    /**
     * 默认方法的意义：
     * 有些方法是公共的，多个类要相同实现，只需在一个地方定义/修改就好了
     *
     * 实现接口，两个默认方法冲突，必须重写
     */
    @Override
    public void say() {
        System.out.println("moff");
    }

    /**
     * 接口还添加了静态方法，可直接调用
     */
    interface Sport {
        static void run() {
            System.out.println("i am running...");
        }
    }

    public static void main(String[] args) {
        Sport.run();
    }
}
