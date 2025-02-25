package com.wipro.java.microservices.o;

public class NewYearDiscount implements Discount {
    @Override
    public double applyDiscount(Book book) {
        return book.getPrice() * 0.90; // Applies a 10% discount correctly
    }
}
