package com.rain6.dp.iterator;

/***
 * 集合接口
 * @author Rain6
 */
public interface Aggregate<E> {
    //实现Iterator
    Iterator<E> iteartor();

    //添加元素
    void add(E e);

    //获取元素
    E get(int index);

    //获取数据长度
    int size();
}
