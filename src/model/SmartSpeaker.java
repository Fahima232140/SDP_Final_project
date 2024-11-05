// src/model/SmartSpeaker.java

package model;

public class SmartSpeaker implements ThirdPartyDevice {
    private String name;

    public SmartSpeaker(String name) {
        this.name = name;
    }

    @Override
    public void activate() {
        System.out.println(name + " SmartSpeaker is now playing music.");
    }

    @Override
    public void deactivate() {
        System.out.println(name + " SmartSpeaker has stopped playing music.");
    }

    public String getName() {
        return name;
    }
}
