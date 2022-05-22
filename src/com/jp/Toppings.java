package com.jp;

public class Toppings {
    String toppingName;
    float toppingPrice;
    public Toppings(String toppingName,float toppingPrice) {
        this.toppingName = toppingName;
        this.toppingPrice = toppingPrice;
    }
    public String getToppingName() {
        return toppingName;
    }
    public float getToppingPrice() {
        return toppingPrice;
    }    
}
