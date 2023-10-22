package org.example;

public class AdvancedSmartSpeaker implements SmartSpeaker {
    @Override
    public void powerOn() {
        System.out.println("Smart speaker is powered on.");
    }

    @Override
    public void powerOff() {
        System.out.println("Smart speaker is powered off.");
    }

    @Override
    public void playMusic() {
        System.out.println("Playing music...");
    }

    @Override
    public void searchInternet(String query) {
        System.out.println("Searching the Internet for: " + query);
    }

    @Override
    public void processCommand(String command) {

    }
}