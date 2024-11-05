// src/controller/SmartHomeController.java

package controller;

import model.Device;
import model.DeviceFactory;

import java.util.ArrayList;
import java.util.List;

public class SmartHomeController {
    private static SmartHomeController instance;
    private List<Device> devices;

    private SmartHomeController() {
        devices = new ArrayList<>();
    }

    public static SmartHomeController getInstance() {
        if (instance == null) {
            instance = new SmartHomeController();
        }
        return instance;
    }

    public void addDevice(String type, String name) {
        Device device = DeviceFactory.createDevice(type, name);
        devices.add(device);
        System.out.println("Added " + type + " '" + name + "' to the system.");
    }

    public void controlDevice(String name, String action) {
        for (Device device : devices) {
            if (device.getName().equalsIgnoreCase(name)) {
                if ("on".equalsIgnoreCase(action)) {
                    device.turnOn();
                } else if ("off".equalsIgnoreCase(action)) {
                    device.turnOff();
                }
                return;
            }
        }
        System.out.println("Device '" + name + "' not found.");
    }

    public void listDevices() {
        System.out.println("Devices in the Smart Home System:");
        for (Device device : devices) {
            System.out.println("- " + device.getName() + " (" + device.getClass().getSimpleName() + ")");
        }
    }

    public List<Device> getDevices() {
        return null;
    }
}
