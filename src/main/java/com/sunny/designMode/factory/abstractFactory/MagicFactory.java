package com.sunny.designMode.factory.abstractFactory;

import com.sunny.designMode.factory.abstractFactory.abstraction.AbstractFactory;
import com.sunny.designMode.factory.abstractFactory.abstraction.Food;
import com.sunny.designMode.factory.abstractFactory.abstraction.Vehicle;
import com.sunny.designMode.factory.abstractFactory.abstraction.Weapon;

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
