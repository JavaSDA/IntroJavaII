package com.company;


import com.company.books.Author;
import com.company.books.Book;
import com.company.vehicle.*;
import com.company.accounts.Account;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        // Abstraction

        // Abstraction is a mechanism that is focused on hiding implementation details
        // from the user. The user doesn't need to how it was done, they only need to know that
        // it works.

//        Vehicle car = new Motorcycle();
//        car.startEngine(true);
//
//        System.out.println(TaskMenu.FILE.getFirstItem());
//        System.out.println(FoodMenu.DESSERT);


//        Account joshua = new Account(2, "Joshua");
//        Account gregory = new Account(4, "Gregory");
//
//        joshua.credit(2000);
//        gregory.credit(1000);
//
//        joshua.transferMoney(gregory, 500);
//
//        System.out.println(joshua.getBalance());
//        System.out.println(gregory.getBalance());

        // Initialize scanner
        Scanner scanner = new Scanner(System.in);

        // prompt the user for author's name and age
        System.out.print("Enter the author's name: ");
        String authorName = scanner.next();
        System.out.print("Enter the author's age: ");
        int authorAge = scanner.nextInt();

        Author fred = new Author(authorName, authorAge);

        Author[] authors = new Author[] {fred};

        // Book details
        System.out.print("Enter the book's price: ");
        int price = scanner.nextInt();
        System.out.println("Enter the book's name: ");
        String bookName = scanner.next();

        Book book = new Book(bookName, authors, price);

        System.out.println("The author(s) of the book: " + book.getName()+ " is/are " + book.getAuthors());

    }
}
// 25 mins
// Write a class called Book that has the following fields:
// name, authors, price
// Write another class called Author that contains the following fields:
// name, age, and the gender
// Create a list of books and return the following output for each book
// "The author(s) of the book `NAME_OF_BOOK` is/are: ------"


// UML diagrams
// Unified Modelling Language















// 20 mins.
// Assuming you were assigned a task to create a roster for
// employees that will decide who will work the night shift
// based on a random basis.
// Write a method in your Company object/class that
// will return a random employee, from the list of employees anytime the method
// is called.

// 10 mins.
// Create an enum to model a  restaurant menu
// They offer 3 categories of meals: Appetizer, Main course and dessert
// Appetizer - Steamed Prawn and cafe latte
// Main course - Continental rice and deep fried chicken
// Dessert - Cupcakes and milk chocolate ice cream
