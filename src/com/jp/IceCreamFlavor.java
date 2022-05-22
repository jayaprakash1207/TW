package com.jp;

public class IceCreamFlavor {
    String flavorName;
    float flavorPrice;
    public IceCreamFlavor(String flavorName, float flavorPrice) {
        this.flavorName = flavorName;
        this.flavorPrice = flavorPrice;
    }
    public String getFlavorName() {
        return flavorName;
    }
    public float getFlavorPrice() {
        return flavorPrice;
    }  
}
