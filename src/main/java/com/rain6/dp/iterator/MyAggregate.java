package com.rain6.dp.iterator;

/***
 * 自定义实现集合类
 * @author Rain6
 * @param <E>
 */
public class MyAggregate<E> implements Aggregate<E> {
    private Object[] array;
    private int index = 0;

    public MyAggregate(int maxSize) {
        array = new Object[maxSize];
    }

    public Iterator<E> iteartor() {
        return new MyIterator<E>(this);
    }

    public void add(E e) {
        array[index] = e;
        index++;
    }

    public E get(int index) {
        return (E) array[index];
    }

    public int size() {
        return array.length;
    }
}
