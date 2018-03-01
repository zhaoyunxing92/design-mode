package com.sunny.designMode.factory.staticFactory;

/**
 * @author sunny
 * @className VehicleFactory
 * @date 2018-02-27 17:29
 * @description: 创建交通工具工厂
 */
public abstract class VehicleFactory {
    abstract Moveable create();
}
