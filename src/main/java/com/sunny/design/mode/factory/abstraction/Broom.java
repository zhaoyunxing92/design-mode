package com.sunny.design.mode.factory.abstraction;

import com.sunny.design.mode.factory.abstraction.abstraction.Vehicle;

/**
 * @author sunny
 * @className Broom
 * @date 2018-02-28 09:58
 * @description:
 */
public class Broom extends Vehicle {
    @Override
    public void run() {
        System.out.println("扫帚飞过来...");
    }
}
