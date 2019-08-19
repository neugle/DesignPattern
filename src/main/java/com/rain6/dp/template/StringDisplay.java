package com.rain6.dp.template;

/***
 * 字符串子类
 * @author Rain6
 */
public class StringDisplay extends AbstractDisplay {
    private String str;

    public StringDisplay(String str) {
        this.str = str;
    }

    @Override
    public void open() {
        System.out.println("\"");
    }

    @Override
    public void print() {
        System.out.println(str);
    }

    @Override
    public void close() {
        System.out.println("\"");
    }
}
