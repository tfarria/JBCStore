package com.company;

public class Checkout {
    private double price;
    private String description;
    private int quantity;
    private double subtotal;
    private double tax = 0.6;
    private double grandTotal;


    public Checkout() {
    }

    public Checkout(double price, String description, int quantity, double subtotal, double tax, double grandTotal) {
        this.price = price;
        this.description = description;
        this.quantity = quantity;
        this.subtotal = subtotal;
        this.tax = tax;
        this.grandTotal = grandTotal;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }

    public double getTax() {
        return tax;
    }

    public void setTax(double tax) {
        this.tax = tax;
    }

    public double getGrandTotal() {
        return grandTotal;
    }

    public void setGrandTotal(double grandTotal) {
        this.grandTotal = grandTotal;
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