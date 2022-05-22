package com.jp;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Shop {

    public void showIceCreamTypes(List<IceCreamType> typeList) {
        System.out.println("Welcome to the IceCream Shop");
        System.out.println("Choose the type of IceCream from the Menu down below");
        for (int i = 1; i < 4; i++) {
            System.out.println("Press " + i + " for " + typeList.get(i - 1).getTypeName());
        }
    }

    public void showIceCreamFlavors(List<IceCreamFlavor> flavorList) {
        System.out.println("Choose the Flavor that you crave from the Menu down below");
        for (int j = 1; j < 4; j++) {
            System.out.println("Press " + j + " for " + flavorList.get(j - 1).getFlavorName());
        }
    }

    public void showToppings(List<Toppings> toppingsList){
        System.out.println("Choose the topping from the Menu Down below");
        for (int j = 1; j < 5; j++) {
            System.out.println("Press " + j + " for " + toppingsList.get(j - 1).getToppingName());
        }
    }

    public void askQuantity(){
        System.out.println("How many iceCreams do you like to buy?");
    }

    public void calculatingBill(int typeChoice, int flavorChoice,int toppingChoice,List<IceCreamType> typeList,List<IceCreamFlavor> flavorList,List<Toppings> toppingsList,int quantity){
        if (flavorChoice == 2){
            float typePrice = typeList.get(typeChoice - 1).getTypePrice();
            float flavorPrice = flavorList.get(flavorChoice - 1).getFlavorPrice();
            float toppingPrice = toppingsList.get(toppingChoice - 1).getToppingPrice();
            float billPrice = (typePrice+flavorPrice+toppingPrice) * quantity;
            System.out.println("Your Bill Price is " + billPrice);
        } else {
            float typePrice = typeList.get(typeChoice - 1).getTypePrice();
            float flavorPrice = flavorList.get(flavorChoice - 1).getFlavorPrice();
            float billPrice = (typePrice+flavorPrice) * quantity;
            System.out.println("Your Bill Price is " + billPrice);
        }
    }

    public static void main(String[] args) {
        int typeChoice;
        int flavorChoice;
        int toppingChoice = 0;
        int quantity;

        Scanner in = new Scanner(System.in);

        List<IceCreamType> typeList = new ArrayList<>();
        typeList.add(0,new IceCreamType("stick",5));
        typeList.add(1,new IceCreamType("Cone",20));
        typeList.add(2,new IceCreamType("Cup",10));

        List<IceCreamFlavor> flavorList = new ArrayList<>();
        flavorList.add(0,new IceCreamFlavor("Vanilla",5));
        flavorList.add(1,new IceCreamFlavor("Chocolate",10));
        flavorList.add(2,new IceCreamFlavor("Strawberry",30));

        List<Toppings> toppingsList = new ArrayList<>();
        toppingsList.add(0,new Toppings("OreoCrumbles",20));
        toppingsList.add(1,new Toppings("Cherries",35));
        toppingsList.add(2,new Toppings("Chocolate Chips",60));
        toppingsList.add(3,new Toppings("Fruity Fruity",10));

        Shop obj = new Shop();

        obj.showIceCreamTypes(typeList);
        typeChoice = in.nextInt();
        obj.showIceCreamFlavors(flavorList);
        flavorChoice = in.nextInt();
        if (flavorChoice == 2) {
            obj.showToppings(toppingsList);
            toppingChoice = in.nextInt();
            obj.askQuantity();
            quantity = in.nextInt();
            obj.calculatingBill(typeChoice, flavorChoice, toppingChoice, typeList, flavorList, toppingsList, quantity);
        } else {
            obj.askQuantity();
            quantity = in.nextInt();
            obj.calculatingBill(typeChoice, flavorChoice, toppingChoice, typeList, flavorList, toppingsList, quantity);
        }
    } 
}
