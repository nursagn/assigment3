package org.example;

public class TV implements Device {
    private int currentChannel = 1;

    @Override
    public void turnOn() {
        System.out.println("TV is turned on. Channel: " + currentChannel);
    }

    @Override
    public void turnOff() {
        System.out.println("TV is turned off.");
    }

    public void changeChannel(int newChannel) {
        currentChannel = newChannel;
        System.out.println("Channel changed to: " + currentChannel);
    }
}

