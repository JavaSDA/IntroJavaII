package com.company;

import com.company.vehicle.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        // Abstraction

        // Abstraction is a mechanism that is focused on hiding implementation details
        // from the user. The user doesn't need to how it was done, they only need to know that
        // it works.

        Vehicle car = new Motorcycle();
        car.startEngine(true);

        System.out.println(TaskMenu.FILE.getFirstItem());
        System.out.println(FoodMenu.DESSERT);

    }
}


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