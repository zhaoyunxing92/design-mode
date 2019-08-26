package com.sunny.design.mode.factory.abstraction;

import com.sunny.design.mode.factory.abstraction.abstraction.AbstractFactory;
import com.sunny.design.mode.factory.abstraction.abstraction.Food;
import com.sunny.design.mode.factory.abstraction.abstraction.Vehicle;
import com.sunny.design.mode.factory.abstraction.abstraction.Weapon;

/**
 * @author sunny
 * @className MagicFactory
 * @date 2018-02-28 09:57
 * @description:
 */
public class MagicFactory extends AbstractFactory {

    /**
     * 创建交通工具
     *
     * @return
     */
    @Override
    public Vehicle createVehicle() {
        return new Car();
    }

    /**
     * 创建武器
     *
     * @return
     */
    @Override
    public Weapon createWeapon() {
        return new AK47();
    }

    /**
     * 创建食物
     *
     * @return
     */
    @Override
    public Food createFood() {
        return new Apple();
    }
}
