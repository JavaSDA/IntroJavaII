package com.company.books;

public class Book {

    // Define the fields
    private String name;
    private Author[] authors;
    private int price;

    // Define constructor
    public Book(String name, Author[] authors, int price) {
        this.name = name;
        this.authors = authors;
        this.price = price;
    }


    // Define getters
    public String getName() {
        return name;
    }

    public String getAuthors() {
        String authorsList = "";

        for (int i = 0; i < authors.length; i++) {
            // if the current author is the last author in the
            // array then print without a comma.
            if (i == authors.length - 1) {
                authorsList += authors[i].getName();
                break;
            } else authorsList += authors[i].getName() + ", ";
        }
        return authorsList;
    }
}
