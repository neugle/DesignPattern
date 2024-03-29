package com.rain6.dp.adapter;

/***
 * 测试代码
 * @author Rain6
 * 参考https://blog.csdn.net/elegant_shadow/article/details/5006175
 * 适配就是由“源”到“目标”的适配，而当中链接两者的关系就是适配器。它负责把“源”过度到“目标”。
 * 举个简单的例子，比如有一个“源”是一个对象人，他拥有2种技能分别是说日语和说英语，
 * 而某个岗位（目标）需要你同时回说日语、英语、和法语，好了，
 * 现在我们的任务就是要将人这个“源”适配的这个岗位中，如何适配呢？
 * 显而易见地我们需要为人添加一个说法语的方法，这样才能满足目标的需要。
 * 接着讨论如何加说法语这个方法，也许你会说，为什么不直接在“源”中直接添加方法，
 * 我的理解是，适配是为了实现某种目的而为一个源类暂时性的加上某种方法，所以不能破坏原类的结构。
 * 同时不这么做也符合Java的高内聚，低耦合的原理。
 * 既然不能直接加，接着我们就来说该怎么来实现为人这个“源”添加一个方法，而又不破坏“源”的本身结构。
 */
public class Demo {
    public static void main(String[] args) {
        Job job = new PersonAdapter();
        job.speakChinese();
        job.speakEnglish();
        job.speakSpanish();
    }
}
