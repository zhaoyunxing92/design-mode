package com.sunny.design.mode.factory.spring;

/**
 * @author sunny
 * @className Car
 * @date 2018-02-27 17:31
 * @description:
 */
public class Car implements Moveable {

    @Override
    public void run() {
        System.out.println("冒着烟奔跑中的car........");
    }
}
