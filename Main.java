package org.example;


public class Main {
    public static void main(String[] args) {
        Device light = new Light();
        TV tv = new TV();
        SmartSpeaker smartSpeaker = new AdvancedSmartSpeaker();
        SmartSpeakerAdapter speakerAdapter = new SmartSpeakerAdapter(smartSpeaker, tv);

        light.turnOn();
        tv.turnOn();
        speakerAdapter.turnOn();

        speakerAdapter.voiceControl("Change channel to 5");
        speakerAdapter.voiceControl("Turn off the lights");
        speakerAdapter.turnOff();
    }
}

