// src/model/Light.java

package model;

public class Light extends Device {
    public Light(String name) {
        super(name);
    }

    @Override
    public void turnOn() {
        System.out.println(name + " light is now ON.");
    }

    @Override
    public void turnOff() {
        System.out.println(name + " light is now OFF.");
    }

    @Override
    public void update(String message) {
        System.out.println(name + " light received update: " + message);
    }
}
