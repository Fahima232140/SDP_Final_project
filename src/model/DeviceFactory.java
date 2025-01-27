// src/model/DeviceFactory.java

package model;

public class DeviceFactory {
    public static Device createDevice(String type, String name) {
        switch (type.toLowerCase()) {
            case "light":
                return new Light(name);
            case "thermostat":
                return new Thermostat(name);
            case "camera":
                return new Camera(name);
            default:
                throw new IllegalArgumentException("Unknown device type: " + type);
        }
    }
}
