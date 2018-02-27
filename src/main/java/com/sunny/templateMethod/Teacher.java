package com.sunny.templateMethod;

/**
 * @author sunny
 * @className Teacher
 * @date 2018-02-26 18:09
 * @description:
 */
public class Teacher extends AbstractPerson {

    /**
     * 穿衣服
     */
    @Override
    protected void dressUp() {
        System.out.println("穿工作服");
    }

    /**
     * 吃早饭
     */
    @Override
    protected void eatBreakfast() {
        System.out.println("做早饭，照顾孩子吃早饭");
    }

    /**
     * 带上东西
     */
    @Override
    protected void takeThings() {
        System.out.println("带上昨晚准备的考卷");
    }

    @Override
    protected boolean isHasDrive() {
        return true;
    }

}
