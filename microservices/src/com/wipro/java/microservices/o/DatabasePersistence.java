package com.wipro.java.microservices.o;

public abstract class DatabasePersistence implements BookPersistence {
    @Override
    public void save(Book book) {  
        System.out.println("Saving book to Database: " + book.getTitle());  
        }
}
