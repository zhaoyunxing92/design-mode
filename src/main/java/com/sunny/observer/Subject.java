package com.sunny.observer;

/**
 * @author sunny
 * @className Subject
 * @date 2018-02-26 14:19
 * @description: 声明了添加、删除、通知观察者方法
 */
public interface Subject {
    /**
     * 添加观察者
     *
     * @param observer
     */
    void registerObserver(Observer observer);

    /**
     * 移除观察者
     *
     * @param observer
     */
    void removeObserver(Observer observer);

    /**
     * 通知观察者
     */
    void notifyObserver();
}
