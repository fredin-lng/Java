package com.alfrecocastillo;

import java.text.NumberFormat;
import java.util.Scanner;

public class TotalTip {
    public static void main(String args[]){

        // take user input on subtotal
        Scanner subTotal = new Scanner(System.in);
        System.out.print("Enter Subtotal: ");
        double price = subTotal.nextDouble();

        // take user input on taxes
        Scanner gratuity = new Scanner(System.in);
        System.out.print("Enter gratuity: ");
        double tipDecimal = gratuity.nextDouble() / 100;

        // calculate total sales price
        double tip = tipDecimal * price;
        double totalPrice = price + tip;

        // format total sales price to currency
        NumberFormat currencyFormat = NumberFormat.getCurrencyInstance();
        String totalTipFormat = currencyFormat.format(tip);
        String totalPriceFormat = currencyFormat.format(totalPrice);

        // display total sales price
        System.out.println("The gratuity is " + totalTipFormat + " and total is " + totalPriceFormat);
    }
}
