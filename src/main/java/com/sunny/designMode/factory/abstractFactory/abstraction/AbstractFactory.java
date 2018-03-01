package com.sunny.designMode.factory.abstractFactory.abstraction;

/**
 * @author sunny
 * @className AbstractFactory
 * @date 2018-02-28 10:01
 * @description:
 */
public abstract class AbstractFactory {
    /**
     * 创建交通工具
     *
     * @return
     */
    public abstract Vehicle createVehicle();

    /**
     * 创建武器
     *
     * @return
     */
    public abstract Weapon createWeapon();

    /**
     * 创建食物
     *
     * @return
     */
    public abstract Food createFood();
}
