package org.example;

public class SmartSpeakerAdapter implements Device {
    private SmartSpeaker smartSpeaker;
    private TV tv;

    public SmartSpeakerAdapter(SmartSpeaker smartSpeaker, TV tv) {
        this.smartSpeaker = smartSpeaker;
        this.tv = tv;
    }

    @Override
    public void turnOn() {
        smartSpeaker.powerOn();
    }

    @Override
    public void turnOff() {
        smartSpeaker.powerOff();
    }

    public void voiceControl(String command) {
        if (command.startsWith("Change channel to ")) {
            int newChannel = Integer.parseInt(command.substring(18));
            tv.changeChannel(newChannel);
        } else {
            smartSpeaker.processCommand(command);
        }
    }
}


