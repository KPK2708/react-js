package com.wipro.java.microservices.o;

public class Invoice {
    private Book book;
    private int quantity;

    public Invoice(Book book, int quantity) {
        this.book = book;
        this.quantity = quantity;
    }

    public void printInvoice() {
        int totalCost = book.getPrice() * quantity; 

        System.out.println("Book: " + book.getTitle());  // Corrected to getTitle()
        System.out.println("Year: " + book.getYear());   // Ensure getYear() exists in Book
        System.out.println("Price per book: " + book.getPrice());
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Cost: " + totalCost);
    }
}
