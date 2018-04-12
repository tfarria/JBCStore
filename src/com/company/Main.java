package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        boolean stop = false;
        Scanner scanner = new Scanner(System.in);
        Checkout checkout;
        String answer;


        do {


            checkout = new Checkout();
            System.out.println("Enter Price : ");
            checkout.setPrice(scanner.nextDouble());
            scanner.nextLine();

            System.out.println("Enter Description : ");
            checkout.setDescription(scanner.nextLine());

            System.out.println("Enter Quantity : ");
            checkout.setQuantity(scanner.nextInt());
            scanner.nextLine();

            double subTotal = checkout.getPrice() * checkout.getQuantity();
            double grandTotal = subTotal + checkout.getTax();
            System.out.println("Your Grand Total is : " + grandTotal);

            System.out.println("Do you want to add another item ? : Yes or No ");
            answer = scanner.nextLine();
            if (answer.equalsIgnoreCase("No ") || answer.equalsIgnoreCase("N"))
                stop = true;


        }while (!stop);



    }
}
//    Welcome to the JBC Store!
//
//        Create an application that allows a teller to add items to a checkout stand, each with a price, description and quantity.
//        After the teller is done, calculate the sub total, tax (6%), and grand total price of the items.
//
//
//
//        The list should look like this:
//
//        Description          Unit Price          Quantity        Total Price
//
//        Gummy bears            5.00                         2                     10.00
//
//        Tax                                                                                            0.60
//
//        Grand total (6%)                                                                  10.60