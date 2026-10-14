package com.pluralsight;

public class Receipt {
    public static void main(String[] args){
        String itemName = "melons";
        double itemPrice = 2.99;
        int quantity = 7;
        double totalPrice = itemPrice * quantity;
        System.out.println("You bought " + quantity + " " + itemName + " for $" + totalPrice);
    }
}
