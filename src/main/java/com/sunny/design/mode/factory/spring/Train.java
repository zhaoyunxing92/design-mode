package com.sunny.design.mode.factory.spring;

/**
 * @author sunny
 * @className Train
 * @date 2018-03-02 16:07
 * @description:
 */
public class Train implements Moveable {
    @Override
    public void run() {
        System.out.println("小火车呜呜呜...");
    }
}
