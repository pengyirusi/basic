package java8.stream;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

/**
 * @author weiyupeng
 * @create 2021/12/7 22:19
 * 流
 */
public class Stream {
    /**
     * 流 在管道中传输
     * 流处理：筛选 排序 聚合 等中间操作
     * 类似 scala，有中间操作和最终操作(collect)
     * +--------------------+    +------+   +------+   +---+   +-------+
     * | stream of elements +--> |filter+-> |sorted+-> |map+-> |collect|
     * +--------------------+    +------+   +------+   +---+   +-------+
     *
     * 特点：
     * Stream并不会存储元素，而是按需计算
     * 数据源 流的来源。 可以是集合，数组，I/O channel， 产生器generator 等
     * 聚合操作 类似SQL语句一样的操作，
     * 比如 filter, map, reduce, find, match, sorted等
     * Stream提供了内部迭代的方式， 通过访问者模式(Visitor)实现
     */

    public static void main(String[] args) {

        /**
         * 生成流
         * stream() − 为集合创建串行流
         * parallelStream() − 为集合创建并行流
         */
        List<String> strings = Arrays.asList("abc", " ", "bc", "efg", "abcd","", "jkl");
        List<String> list = strings.stream().collect(Collectors.toList());
        List<String> list1 = strings.parallelStream().collect(Collectors.toList());

        /**
         * forEach 迭代流中的每一个数据
         * 对流 对集合 都行
         */
        Random random = new Random();
        random.ints().limit(10).forEach(System.out::println);

        /**
         * map 映射流中的每一个数据
         */
        Arrays.asList(1, 2, 3).stream().map(a -> a * 2).forEach(System.out::println);

        /**
         * filter 过滤元素，布尔值条件
         */
        Arrays.asList(1, 2, 3).stream().filter(a -> a%2 == 0).forEach(System.out::println);

        /**
         * limit 获取指定流的数量
         */
        Arrays.asList(1, 2, 3).stream().limit(2).collect(Collectors.toList());

        /**
         * sorted 排序
         */
        Arrays.asList(3, 2, 1).stream().sorted().collect(Collectors.toList());

        /**
         * 统计
         */
        List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);
        IntSummaryStatistics stats = numbers.stream().mapToInt((x) -> x).summaryStatistics();
        int i1 = stats.getMax();
        int i2 = stats.getMin();
        long i3 = stats.getSum();
        long i4 = stats.getCount();
        double i5 = stats.getAverage();

        numbers.stream().collect(Collectors.toList()).forEach(System.out::println);
        numbers.forEach(System.out::println);
    }
}
