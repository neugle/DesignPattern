package com.rain6.dp.iterator;

/***
 * 自定义实现迭代器
 * @author Rain6
 * @param <E>
 */
public class MyIterator<E> implements Iterator<E> {
    private MyAggregate myAggregate;
    private int size;
    private int current = 0;

    public MyIterator(MyAggregate myAggregate) {
        this.myAggregate = myAggregate;
        this.size = myAggregate.size();
    }

    public boolean hasNext() {
        return current < size;
    }

    public E next() {
        E e = (E) myAggregate.get(current);
        current++;
        return e;
    }
}
