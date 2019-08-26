package com.sunny.design.mode.factory.statical;

/**
 * @author sunny
 * @className CarFactory
 * @date 2018-02-27 17:47
 * @description:
 */
public class CarFactory extends VehicleFactory {
    @Override
    Moveable create() {
        return new Car();
    }
}
