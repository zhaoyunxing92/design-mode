package com.sunny.designMode.factory.staticFactory;

/**
 * @author sunny
 * @className Main
 * @date 2018-02-27 15:37
 * @description:
 */
public class Main {
    public static void main(String[] args) {
        VehicleFactory factory = new PlaneFactory();
        Moveable moveable = factory.create();
        moveable.run();

    }
}
