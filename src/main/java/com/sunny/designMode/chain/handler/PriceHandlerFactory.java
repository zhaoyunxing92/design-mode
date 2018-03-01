package com.sunny.designMode.chain.handler;

/**
 * @author sunny
 * @className PriceHandlerFactory
 * @date 2018-02-27 14:08
 * @description:
 */
public class PriceHandlerFactory {
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
}
