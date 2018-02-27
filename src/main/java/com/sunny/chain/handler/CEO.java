package com.sunny.chain.handler;

/**
 * @author sunny
 * @className CEO
 * @date 2018-02-27 11:24
 * @description: 最多处理55%的折扣 超过了拒绝
 */
public class CEO extends PriceHandler {
    /**
     * 处理折扣请求
     *
     * @param discount 折扣
     */
    @Override
    public void processDiscount(float discount) {
        if (discount <= 0.55) {
            System.out.format("%s 配准了折扣：%.2f%n", this.getClass().getName(), discount);
        } else {
            System.out.format("%s 拒绝了折扣：%.2f%n", this.getClass().getName(), discount);
        }
    }
}
