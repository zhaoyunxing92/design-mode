package com.sunny.chain;

import com.sunny.chain.handler.PriceHandler;
import com.sunny.chain.handler.PriceHandlerFactory;

/**
 * @author sunny
 * @className Customer
 * @date 2018-02-27 11:30
 * @description: 客户
 */
public class Customer {
    private PriceHandler priceHandler;

    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.setPriceHandler(PriceHandlerFactory.createPriceHandler());

        //发起折扣请求
        customer.requestDiscount((float) 0.22);

        customer.requestDiscount((float) 0.022);

        customer.requestDiscount((float) 0.82);

        customer.requestDiscount((float) 0.48);
    }

    public void setPriceHandler(PriceHandler priceHandler) {
        this.priceHandler = priceHandler;
    }

    /**
     * 发起折扣请求
     *
     * @param discount 折扣
     */
    public void requestDiscount(float discount) {
        priceHandler.processDiscount(discount);
    }
}
