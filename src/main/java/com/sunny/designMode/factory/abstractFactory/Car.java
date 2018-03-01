package com.sunny.designMode.factory.abstractFactory;

import com.sunny.designMode.factory.abstractFactory.abstraction.Vehicle;

/**
 * @author sunny
 * @className Car
 * @date 2018-02-27 17:31
 * @description:
 */
public class Car extends Vehicle {

    @Override
    public void run() {
        System.out.println("冒着烟奔跑中的car........");
    }
}
