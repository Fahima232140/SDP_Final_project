// src/model/ThirdPartyDeviceAdapter.java

package model;

public class ThirdPartyDeviceAdapter extends Device {
    private ThirdPartyDevice thirdPartyDevice;

    public ThirdPartyDeviceAdapter(ThirdPartyDevice thirdPartyDevice, String name) {
        super(name);  // Pass the name to the Device superclass
        this.thirdPartyDevice = thirdPartyDevice;
    }

    @Override
    public void turnOn() {
        thirdPartyDevice.activate();  // Adapts the activate method
    }

    @Override
    public void turnOff() {
        thirdPartyDevice.deactivate();  // Adapts the deactivate method
    }

    @Override
    public void update(String message) {

    }
}
