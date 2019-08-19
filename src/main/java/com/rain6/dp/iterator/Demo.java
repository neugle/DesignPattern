package com.rain6.dp.iterator;

/***
 * 测试代码
 * @author Rain6
 * 参考https://blog.csdn.net/asd5618asd/article/details/81604554
 * 相信很多人在操作完后都会有个巨大的疑惑,明摆着一个foreach就能解决的问题,为什么要用这么麻烦的方式?
 * 实际上,该设计模式给我们带来的是一个”可复用“的组件 :
 * 能够将以ArrayList转换成用数组,而其余的代码基本保持不动,
 * 因为只要类中iterator方法能正确的返回Iterator的实例,hasNext方法和next方法便可以正常使用.
 * 由此,若是类被别的方法调用了无数次之后,突然不想要用ArrayList了,想要用数组的形式,该怎么办?
 * 若是我们当时用的是foreach的形式来遍历的话,恐怕需要修改个无数遍,这就非常麻烦了,
 * 这时,Iterator设计模式的应用,就能给我们带来很多便利
 */
public class Demo {
    public static void main(String[] args) {
        Aggregate<String> aggregate = new MyAggregate<String>(2);
        aggregate.add("测试1");
        aggregate.add("测试2");
        Iterator<String> iterator = aggregate.iteartor();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
