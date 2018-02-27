package com.sunny.chain.handler;

/**
 * @author sunny
 * @className Sales
 * @date 2018-02-27 11:18
 * @description: 销售人员处理5%的折扣
 */
public class Sales extends PriceHandler {
    /**
     * 处理折扣请求
     *
     * @param discount 折扣
     */
    @Override
    public void processDiscount(float discount) {
        if (discount <= 0.05) {
            System.out.format("%s 批准了折扣：%.4f%n", this.getClass().getName(), discount);
        } else {
            //向后传递
            successor.processDiscount(discount);
        }
    }
}
