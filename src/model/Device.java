// src/model/Device.java

package model;

public abstract class Device {
    protected String name;

    public Device(String name) {
        this.name = name;
    }

    public abstract void turnOn();
    public abstract void turnOff();

    public String getName() {
        return name;
    }

    public abstract void update(String message);
}
