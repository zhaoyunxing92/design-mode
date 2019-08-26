package com.sunny.design.mode.observer;

import java.util.Observable;

/**
 * @author sunny
 * @className ConcreteWeatherObserver
 * @date 2018-02-26 16:36
 * @description:
 */
public class ConcreteWeatherObserver implements java.util.Observer {

    private String observerName;

    public ConcreteWeatherObserver(String observerName) {
        this.observerName = observerName;
    }

    @Override
    public void update(Observable o, Object arg) {
        //使用推的方式
        System.out.println(observerName + " 收到了消息，内容是：" + arg);

        // 使用拉的方式
        System.out.println(observerName + " 收到消息，采用拉的方式获取，内容是: " + ((ConcreteWeatherSubject) o).getContent());
    }
}
