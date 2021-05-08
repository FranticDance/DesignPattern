package com.my.pattern.behavior.strategy.demo2;

/**
 * @author lee
 * @version 1.0
 * @date 2021/5/8 下午4:56
 */
public class YYKShop {
    Sale sale;

    public void setSale(Sale sale) {
        this.sale = sale;
    }

    public void pay(String goodsName, double originPrice){
        System.out.println( "购买商品:"+ goodsName +",享受折扣点:" + sale.getDiscount());
        System.out.println("需要支付" + sale.price(originPrice) + "元");
    }
}
