package com.sunny.designMode.observer;

/**
 * @author sunny
 * @className Client
 * @date 2018-02-26 15:03
 * @description: 测试
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

        // jdk的观察者
        System.out.println("-------------------  jdk 自带的实现  ---------------------------");
        ConcreteWeatherSubject concreteWeatherSubject = new ConcreteWeatherSubject();
        ConcreteWeatherObserver zhang1 = new ConcreteWeatherObserver("张三");
        ConcreteWeatherObserver lisi1 = new ConcreteWeatherObserver("李四");

        concreteWeatherSubject.addObserver(zhang1);
        concreteWeatherSubject.addObserver(lisi1);

        concreteWeatherSubject.setContent("jdk 的观察者");


    }
}
