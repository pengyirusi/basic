package java8.methodCite;

import java.io.Serializable;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Supplier;

/**
 * @author weiyupeng
 * @create 2021/12/7 20:59
 * 方法引用
 */
public class Car {
    /**
     * 方法引用可以使语言的构造更紧凑简洁，减少冗余代码
     * 方法引用使用一对冒号 ::
     */

    private String name;

    public static Car create(String s, final Supplier<Car> supplier) {
        Car car = supplier.get();
        car.name = s;
        return car;
    }

    public static void collide(final Car car) {
        System.out.println("collide " + car.toString());
    }

    @Override
    public String toString() {
        return "name is" + name;
    }

    static Consumer<Object> objectConsumer = (Object s) -> System.out.println(s);

    public static void test() {
        List<? extends Serializable> list = Arrays.asList("1", 2, 3.5);
        list.forEach(Car.objectConsumer);
        System.out.println("-------------");
        list.forEach(System.out::println);
    }

    public static void main(String[] args) {
        Car car = Car.create("tom", Car::new);
        Car car2 = Car.create("jerry", Car::new);
        List<Car> cars = Arrays.asList(car, car2);
        cars.forEach(Car::collide);

        test();
    }
}
