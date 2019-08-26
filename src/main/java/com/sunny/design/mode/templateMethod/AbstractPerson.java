package com.sunny.design.mode.templateMethod;

/**
 * @author sunny
 * @className AbstractPerson
 * @date 2018-02-26 18:03
 * @description: 举个例子，以准备去学校所要做的工作（prepareGotoSchool）为例，假设需要分三步：穿衣服（dressUp），吃早饭（eatBreakfast），带上东西（takeThings），开车（drive）。学生和老师要做得具体事情肯定有所区别。
 */
public abstract class AbstractPerson {
    /**
     * 抽象类定义整个流程骨架
     */
    public final void preparGoToSchool() {
        dressUp();
        eatBreakfast();
        takeThings();
        /**
         * 有车才开车去学校
         */
        if (isHasDrive()) {
            drive();
        }

    }

    /**
     * Hook  钩子函数，子类可以选择是否开车
     *
     * @return
     */
    protected boolean isHasDrive() {
        return false;
    }
    //以下是不同子类根据自身特性完成的具体步骤

    /**
     * 穿衣服
     */
    protected abstract void dressUp();

    /**
     * 吃早饭
     */
    protected abstract void eatBreakfast();

    /**
     * 带上东西
     */
    protected abstract void takeThings();

    /**
     * 开车去学校
     */
    private void drive() {
        System.out.println("开车去学校");
    }

}
