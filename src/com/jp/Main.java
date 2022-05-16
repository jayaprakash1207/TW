package com.jp;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        IceCream[] iceCream = new IceCream[3];
        iceCream[0] = new IceCream("Stick",20,3, new String[]{"chocolate", "vanilla", "strawberry"}, new int[]{30,20,40});
        iceCream[1] = new IceCream("Cone", 40,3, new String[]{"chocolate", "vanilla", "strawberry"}, new int[]{30,20,40});
        iceCream[2] = new IceCream("Cup", 30,3, new String[]{"chocolate", "vanilla", "strawberry"}, new int[]{30,20,40});

        Scanner in = new Scanner(System.in);

        System.out.println("Welcome To The IceCream Shop");
        System.out.println("Choose Your Type Of IceCream From the Menu Down Below");
        for (int i = 0; i < 3; i++) {
            System.out.println("Press " + i + " for " + iceCream[i].type);
        }
        int type_of_iceCream = in.nextInt();

        System.out.println("Choose Your Flavor that you crave From the Menu Down Below");
        for (int j = 0; j < 3; j++) {
            System.out.println("Press " + j + " for " + iceCream[j].flavor[j]);
        }
        int flavor_of_iceCream = in.nextInt();

        System.out.println("Enter the Quantity of iceCream that you wanna buy : ");
        int quantity = in.nextInt();

        int total_price;
        int price_of_type;
        int price_of_flavor = 0;

        price_of_type = iceCream[type_of_iceCream].type_price;

        int k = 0;
        for (String expected: iceCream[type_of_iceCream].flavor) {
            if (expected.equals(iceCream[type_of_iceCream].flavor[flavor_of_iceCream])) {
                price_of_flavor = iceCream[type_of_iceCream].flavour_price[k];
            }
            k++;
        }
        total_price = quantity * (price_of_type + price_of_flavor);
        System.out.println("The Total Cost Price is = " + total_price);
    }    
}
