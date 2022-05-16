package com.jp;

public class IceCream {
    String type;
    int type_price;
    int no_of_flavors;
    String[] flavor;
    int[] flavour_price;

    public IceCream(String type, int type_price, int no_of_flavors, String[] flavor,int[] flavour_price) {
        this.type = type;
        this.type_price = type_price;
        this.no_of_flavors = no_of_flavors;
        this.flavor = flavor;
        this.flavour_price = flavour_price;
    }   
}
