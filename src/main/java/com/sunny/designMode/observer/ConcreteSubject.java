package com.sunny.designMode.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author sunny
 * @className ConcreteSubject
 * @date 2018-02-26 14:26
 * @description: 具体的目标对象，负责抱有关状态存入到相应的观察者对象中
 */
public class ConcreteSubject implements Subject {
    private String message;
    /**
     * 注意到这个List集合的泛型参数为Observer接口，设计原则：面向接口编程而不是面向实现编程
     */
    private List<Observer> observers;


    ConcreteSubject() {
        observers = new ArrayList<Observer>();
    }

    String getMessage() {
        return message;
    }
    /**
     * 添加观察者
     *
     * @param observer
     */
    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    /**
     * 移除观察者
     *
     * @param observer
     */
    @Override
    public void removeObserver(Observer observer) {
        if (!observers.isEmpty()) {
            observers.remove(observer);
        }
    }

    /**
     * 通知观察者
     */
    @Override
    public void notifyObserver() {
        for (Observer observer : observers) {
            observer.update(this);
        }
    }

    void setInfomation(String msg) {
        this.message = msg;
        System.out.println("服务更新消息： " + msg);
        //消息更新，通知所有观察者
        notifyObserver();
    }
}
