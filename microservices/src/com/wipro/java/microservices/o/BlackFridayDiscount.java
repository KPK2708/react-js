package com.wipro.java.microservices.o;

public class BlackFridayDiscount implements Discount {
    @Override
    public double applyDiscount(Book book) {
        return book.getPrice() * 0.80; 
    }
}
