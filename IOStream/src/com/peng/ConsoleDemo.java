package com.peng;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author weiyupeng
 * @create 2021/12/10 21:13
 */
public class ConsoleDemo {

    public static void test1() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        System.out.println(s);
    }

    /**
     * 按字符读
     * @throws IOException
     */
    public static void test2() throws IOException {
        char ch;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("read to #");
        do {
            ch = (char) br.read();
            System.out.println(ch);
        } while (ch != '#');
    }

    /**
     * 按行读
     * @throws IOException
     */
    public static void test3() throws IOException {
        String str;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("read to \"END\"");
        do {
            str = br.readLine();
            System.out.println(str);
        } while (!"END".equals(str));
    }

    public static void test4() {
        int c = 'a';
        System.out.write(c);
        System.out.write(c);

        // 光放到缓冲区了，所以没有输出
    }

    public static void test5() {
        int c = 'a';
        System.out.write(c);
        System.out.write(c);

        //调用了flush，将缓冲区的字符输出到控制台，但不持久化
        System.out.write('\n');
    }

    public static void main(String[] args) throws IOException {
        test5();
    }
}

