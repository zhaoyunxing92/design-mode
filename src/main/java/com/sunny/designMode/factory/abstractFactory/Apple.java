package com.sunny.designMode.factory.abstractFactory;

import com.sunny.designMode.factory.abstractFactory.abstraction.Food;

/**
 * @author sunny
 * @className Apple
 * @date 2018-02-28 09:52
 * @description:
 */
public class Apple extends Food {
    @Override
    public void printName() {
        System.out.println("apple...");
    }
}
