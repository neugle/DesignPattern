package com.rain6.dp.template;

/***
 * 测试程序
 * @author Rain6
 */
public class Demo {
    public static void main(String[] args) {
        AbstractDisplay display1 = new CharDisplay('r');
        AbstractDisplay display2 = new StringDisplay("rain6");
        display1.display();
        display2.display();
    }
}
