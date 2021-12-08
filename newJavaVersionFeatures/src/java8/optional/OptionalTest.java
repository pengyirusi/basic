package java8.optional;

import java.util.Optional;
import java.util.function.Consumer;

/**
 * @author weiyupeng
 * @create 2021/12/8 21:41
 */
public class OptionalTest {
    public static void main(String[] args) {
        Person person = new Person();
        Optional<Person> optional = Optional.of(person);

        Optional<Object> empty = Optional.empty();

        System.out.println(optional.isPresent() == optional.isEmpty());
        System.out.println(false);

        optional.ifPresentOrElse(new Consumer<Person>() {
            @Override
            public void accept(Person person) {
                System.out.println("accept: " + person.name);
            }
        }, new Runnable() {
            @Override
            public void run() {
                System.out.println("run: hello");
            }
        });
        // lambda
        empty.ifPresentOrElse(object -> System.out.println("accept: " + object.hashCode()),
                () -> System.out.println("run: hello"));

        //允许传入 null
        Optional.ofNullable(null);

        // 判空
        System.out.println(optional.isEmpty());

        // 判等
        System.out.println(optional.equals(new Person()));

        // filter get
        System.out.println(optional.filter(person1 -> person1.name.equals("peng")).get().age);

        // hashcode
        System.out.println(optional.hashCode());

        // orElse
        System.out.println(optional.orElse(new Person()).name);

    }
}

class Person {
    String name = "peng";
    int age = 26;
}
