package org.example;

public class Computer implements Device {
    @Override
    public void turnOn() {
        System.out.println("Computer is turned on.");
    }

    @Override
    public void turnOff() {
        System.out.println("Computer is turned off.");
    }
}

