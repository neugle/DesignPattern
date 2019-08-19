package com.rain6.dp.iterator;

/***
 * 迭代器接口
 * @author Rain6
 */
public interface Iterator<E> {
    //是否还有下一个
    boolean hasNext();

    //获取下一个
    E next();
}
