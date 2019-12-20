package com.my.pattern.responsibilitychain.impl3plus2;

/**
 * @author lee
 */
public class PurchaseRequest {
    private int price;
    private String type;

    public PurchaseRequest(int price, String type) {
        this.price = price;
        this.type = type;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
