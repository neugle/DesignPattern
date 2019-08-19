package com.rain6.dp.adapter;

/***
 * 人员适配器
 * 适配新的语言技术（法语）
 * @author Rain6
 */
public class PersonAdapter extends Person implements Job {
    @Override
    public void speakSpanish() {
        System.out.println("¡Hola!");
    }
}
