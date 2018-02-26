package com.sunny.observer;

/**
 * @author sunny
 * @className Client
 * @date 2018-02-26 15:03
 * @description:
 */
public class Client {
    public static void main(String[] args) {
        //1.创建目标
        ConcreteSubject concreteSubject = new ConcreteSubject();

        //2.创建观察者
        ConcreteObserver zhang = new ConcreteObserver("张三");
        ConcreteObserver lisi = new ConcreteObserver("李四");
        ConcreteObserver wang = new ConcreteObserver("王五");

        /**
         * 添加观察者
         */
        concreteSubject.registerObserver(zhang);
        concreteSubject.registerObserver(lisi);
        concreteSubject.registerObserver(wang);

        concreteSubject.setInfomation("hello world！");

        System.out.println("----------------------------------------------");
         /*移除wang 观察者*/
        concreteSubject.removeObserver(wang);

        concreteSubject.setInfomation("wang 已经删除，大家注意！");
    }
}