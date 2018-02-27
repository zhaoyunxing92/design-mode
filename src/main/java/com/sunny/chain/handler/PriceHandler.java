package com.sunny.chain.handler;

/**
 * @author sunny
 * @className PriceHandler
 * @date 2018-02-27 11:09
 * @description: 价格处理人，负责处理客户折扣申请
 */
public abstract class PriceHandler {
    /**
     * 直接后继用于传递请求
     */
    protected PriceHandler successor;

    /**
     * 创建  PriceHandler工程方法
     *
     * @return
     */
    public static PriceHandler createPriceHandler() {
        PriceHandler sales = new Sales();
        PriceHandler manger = new Manager();
        PriceHandler ceo = new CEO();
        /*设置后继*/
        sales.setSuccessor(manger);
        manger.setSuccessor(ceo);

        return sales;
    }

    public void setSuccessor(PriceHandler successor) {
        this.successor = successor;
    }

    /**
     * 处理折扣请求
     *
     * @param discount 折扣
     */
    public abstract void processDiscount(float discount);
}
