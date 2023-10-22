package org.example;

public interface SmartSpeaker {
    void powerOn();
    void powerOff();
    void playMusic();
    void searchInternet(String query);

    void processCommand(String command);
}
