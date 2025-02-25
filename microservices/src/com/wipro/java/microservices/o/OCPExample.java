package com.wipro.java.microservices.o;


public class OCPExample {
    public static void main(String[] args) {
        Book book = new Book("The Alchemist", 500);

        Discount newYearDiscount = new NewYearDiscount();
        Discount blackFridayDiscount = new BlackFridayDiscount();

        System.out.println("New Year Discount: $" + newYearDiscount.applyDiscount(book));
        System.out.println("Black Friday Discount: $" + blackFridayDiscount.applyDiscount(book));
    }
}
