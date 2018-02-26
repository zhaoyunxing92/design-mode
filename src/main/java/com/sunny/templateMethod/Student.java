package com.sunny.templateMethod;

/**
 * @author sunny
 * @className Student
 * @date 2018-02-26 18:08
 * @description:
 */
public class Student extends AbstractPerson {
    /**
     * 穿衣服
     */
    @Override
    protected void dressUp() {
        System.out.println("穿校服");
    }

    /**
     * 吃早饭
     */
    @Override
    protected void eatBreakfast() {
        System.out.println("吃妈妈做好的早饭");

    }

    /**
     * 带上东西
     */
    @Override
    protected void takeThings() {
        System.out.println("背书包，带上家庭作业和红领巾");
    }
}
