package com.company.collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class MainCollection {
    public static void main(String[] args) {

        // Sets is used for storing unique items
        // i.e it can't take in duplicates

        // N.B: Items created inside a collection are transformed into objects.


        // HashSet is an implementation of the Set Interface that
        // doesn't store items in any ordered fashion. i.e items order
        // may be randomized
        /*Set<String> numbers = new HashSet<>();
        numbers.add("Bobby");
        numbers.add("Dave");
        numbers.add("Larry");
        numbers.add("John");
        numbers.add("Larry");

        System.out.println(numbers);*/

        // TreeSet is an implementation of the Set interface that
        // compares and returns a sorted set of data from the input.
//        Set<String> names = new TreeSet<>();
//        names.add("Dave");
//        names.add("Bobby");
//        names.add("Larry");
//        names.add("John");
//        names.add("Larry");
//
//
//        System.out.println(names);

        // LinkedHashSet is an implementation of the Set interface that
        // maintains the order of input of the data stored in it.
//        Set<String> names = new LinkedHashSet<>();
//        names.add("Dave");
//        names.add("Bobby");
//        names.add("Larry");
//        names.add("John");
//        names.add("Larry");
//
//
//
//        System.out.println(names);


        // List is an ordered implementation of the Set Interface. It
        // contains indexes that allow us to retrieve data stored at a particular
        //position on the list.

        // An ArrayList allows us to define a resizable array object to suit our needs
        // You don't have to define a size at object instantiation
        // ArrayList -> O(1)
/*        List<String> names = new ArrayList<>();
        names.add("Dave");
        names.add("Bobby");
        names.add("Larry");
        names.add("John");
        names.add("Larry");

        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i));
        }
        */

        // LinkedList is implemented as nodes that are joined or linked to each other
        // LinkedList -> O(n)
//        List<String> names = new LinkedList<>();
//        names.add("Dave");
//        names.add( "Bobby");
//        names.add("Larry");
//        names.add(2, "John");
//        names.add("Larry");
//
//        for (int i = 0; i < names.size(); i++) {
//            System.out.println(names.get(i));
//        }


        // A queue is an interface for building LIFO and FIFO queues
        // FIFO - First In First Out (Start of the queue)
        // LIFO - Last In First OUt (End of the line)
        Queue<String> names = new LinkedList<>();
        names.offer("Dave");
        names.offer( "Bobby");
        names.offer("Larry");
        names.offer("John");
        names.offer("Larry");


        // System.out.println(names.offer("James")); // The offer() returns a boolean based on the success of the operation

        // The element() returns the first item of the queue but does not remove it from the queue.
        // if the queue is empty, it returns a NoSuchElementException
//        System.out.println(names.element());

        // The peek() works exactly like the element() but doesn't throw an exception
        // if the queue is empty. It returns null if the  queue is empty.
//        System.out.println(names.peek());


        // The remove() removes the first element of the queue and returns it. It returns a NoSuchElementException
        // if the queue is empty.
//        System.out.println(names.remove());
//        System.out.println(names);
//
        // The poll() removes the first element of the queue and returns it. It returns null if the queue is empty.
        System.out.println(names.poll());
        System.out.println(names);

    }

    // 15 mins.
    // Write a method that takes in 6 numbers from the user and
    // returns that data in a sorted format using the set interface and call that method in your main method

    // 15 mins
    // Write a method that will process the scores(integers) of 20 students and return the maximum using an arrayList.

}
