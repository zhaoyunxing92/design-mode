package com.sunny.design.mode.factory.statical;

/**
 * @author sunny
 * @className VehicleFactory
 * @date 2018-02-27 17:29
 * @description: 创建交通工具工厂
 */
public abstract class VehicleFactory {
    /**
     * 可移动的工具
     *
     * @return
     */
    abstract Moveable create();
}
