// src/model/Thermostat.java

package model;

public class Thermostat extends Device {
    public Thermostat(String name) {
        super(name);
    }

    @Override
    public void turnOn() {
        System.out.println(name + " thermostat is now ON.");
    }

    @Override
    public void turnOff() {
        System.out.println(name + " thermostat is now OFF.");
    }

    @Override
    public void update(String message) {

    }
}
