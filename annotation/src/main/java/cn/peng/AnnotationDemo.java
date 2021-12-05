package cn.peng;

import cn.peng.vo.Person;
import cn.peng.vo.User;
import cn.peng.parser.CheckParser;

/**
 * @author weiyupeng
 * @create 2021/12/5 14:38
 */
public class AnnotationDemo {
    public static void main(String[] args) {
        User user = new User();
        Person person = new Person();
        CheckParser parser = new CheckParser();
        parser.parse(user.getClass());
        parser.parse(person.getClass());
    }
}
