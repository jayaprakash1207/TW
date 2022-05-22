package com.jp;

public class IceCreamType {
    String typeName;
    float typePrice;
    public IceCreamType(String typeName, float typePrice) {
        this.typeName = typeName;
        this.typePrice = typePrice;
    }
    public String getTypeName() {
        return typeName;
    }
    public float getTypePrice() {
        return typePrice;
    }   
}
