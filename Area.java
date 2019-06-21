package com.newfeatures;

public class Apple {
    private String color; // 颜色
    private double weight; // 重量

    public Apple() {
        this.color = null;
        this.weight = 0.0;
    }

    public Apple(String color, double weight) {
        this.color = color;
        this.weight = weight;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public double getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "颜色 :" + this.color + ", 重量 :" + this.weight;
    }
}
package com.newfeatures;

import java.util.Objects;

@FunctionalInterface
interface Consumer<T> {
    void accept(T t);

    // andThen先执行调用者再执行参数，compose则相反
    default Consumer<T> andThen(Consumer<? super T> after) {
        Objects.requireNonNull(after);  // 空对象报异常，否则返回自身
        return (T t) -> {
            accept(t);
            after.accept(t);
        };
    }
}
public class LambdaTest {
    public static void ConsumerApple(Apple[] apps, Consumer<Apple> c) {
        for (Apple app : apps) {
            c.accept(app);
        }
    }

    public static void main(String[] args) {
        Apple app1 = new Apple("red", 3.0);
        Apple app2 = new Apple("blue", 4.0);
        Apple app3 = new Apple("green", 5.0);
        Apple[] apps = {app1, app2, app3};


        // lambda形式
        System.out.println("lambda实现函数式接口");
        ConsumerApple(apps, (c) -> {
            System.out.println(c.toString());
        });


        // 匿名内部类
        System.out.println("匿名内部类实现函数式接口");
        ConsumerApple(apps, new Consumer<Apple>() {
            @Override
            public void accept(Apple apple) {
                System.out.println(apple.toString());
            }
        });


    }
}

