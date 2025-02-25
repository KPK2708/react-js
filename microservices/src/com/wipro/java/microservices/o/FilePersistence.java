package com.wipro.java.microservices.o;

import java.io.FileWriter;
import java.io.IOException;

public class FilePersistence implements BookPersistence {
    @Override
    public void save(Book book) {  
        try (FileWriter writer = new FileWriter("books.txt", true)) {
            writer.write(book.getTitle() + "," + book.getYear() + "," + book.getPrice() + "\n");
            System.out.println("Book saved to file.");
        } catch (IOException e) {
            System.out.println("Error saving book: " + e.getMessage());
        }
    }
}

