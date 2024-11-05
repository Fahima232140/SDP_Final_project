// src/model/Camera.java

package model;

public class Camera extends Device {
    public Camera(String name) {
        super(name);
    }

    @Override
    public void turnOn() {
        System.out.println(name + " camera is now ON.");
    }

    @Override
    public void turnOff() {
        System.out.println(name + " camera is now OFF.");
    }

    @Override
    public void update(String message) {

    }
}
