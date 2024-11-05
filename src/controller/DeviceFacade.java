// src/controller/DeviceFacade.java

package controller;

import model.Device;
import java.util.List;

public class DeviceFacade {
    private SmartHomeController controller;

    public DeviceFacade(SmartHomeController controller) {
        this.controller = controller;
    }

    public void turnAllDevicesOn() {
        List<Device> devices = controller.getDevices();
        for (Device device : devices) {
            device.turnOn();
        }
    }

    public void turnAllDevicesOff() {
        List<Device> devices = controller.getDevices();
        for (Device device : devices) {
            device.turnOff();
        }
    }
}
