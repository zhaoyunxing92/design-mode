package com.sunny.design.mode.chain.handler;

/**
 * @author sunny
 * @className Manager
 * @date 2018-02-27 11:24
 * @description: 最多处理30%的折扣
 */
public class Manager extends PriceHandler {
    /**
     * 处理折扣请求
     *
     * @param discount 折扣
     */
    @Override
    public void processDiscount(float discount) {
        if (discount <= 0.3) {
            System.out.format("%s 批准了折扣：%.2f%n", this.getClass().getName(), discount);
        } else {
            //向后传递
            successor.processDiscount(discount);
        }
    }
}
