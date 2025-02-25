package com.wipro.java.microservices.o;

public class PersistenceManager {
    private BookPersistence persistence;

    public PersistenceManager(BookPersistence persistence) {
        this.persistence = persistence;
    }

    public void saveBook(Books book) {
        persistence.save(book);
    }
}