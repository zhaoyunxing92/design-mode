package com.sunny.observer;

/**
 * @author sunny
 * @className Subject
 * @date 2018-02-26 14:19
 * @description: 声明了添加、删除、通知观察者方法
 */
public interface Subject {

    void registerObserver(Observer observer);

    void removeObserver(Observer observer);

    void notifyObserver();
}
