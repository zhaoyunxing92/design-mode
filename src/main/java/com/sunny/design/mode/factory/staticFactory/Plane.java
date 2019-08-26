package com.sunny.design.mode.factory.staticFactory;

/**
 * @author sunny
 * @className Plane
 * @date 2018-02-27 17:40
 * @description:
 */
public class Plane implements Moveable {
    @Override
    public void run() {
        System.out.println("飞机起飞...");
    }
}
