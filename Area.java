package com.newfeatures;

public class Apple {
    private String color; // ��ɫ
    private double weight; // ����

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
        return "��ɫ :" + this.color + ", ���� :" + this.weight;
    }
}
package com.newfeatures;

import java.util.Objects;

@FunctionalInterface
interface Consumer<T> {
    void accept(T t);

    // andThen��ִ�е�������ִ�в�����compose���෴
    default Consumer<T> andThen(Consumer<? super T> after) {
        Objects.requireNonNull(after);  // �ն����쳣�����򷵻�����
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


        // lambda��ʽ
        System.out.println("lambdaʵ�ֺ���ʽ�ӿ�");
        ConsumerApple(apps, (c) -> {
            System.out.println(c.toString());
        });


        // �����ڲ���
        System.out.println("�����ڲ���ʵ�ֺ���ʽ�ӿ�");
        ConsumerApple(apps, new Consumer<Apple>() {
            @Override
            public void accept(Apple apple) {
                System.out.println(apple.toString());
            }
        });


    }
}

