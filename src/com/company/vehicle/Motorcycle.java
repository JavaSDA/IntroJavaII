package com.company.vehicle;

import java.io.IOException;
import java.nio.CharBuffer;

public class Motorcycle implements Vehicle {

    public void startEngine(boolean key) {
        if (key) {
            System.out.println("Motorcycle Engine Started");
        } else {
            System.out.println("Insert key to start");
        }
    }

    public void stopEngine() {
        System.out.println("Motorcycle engine stopped!");
    }

}
