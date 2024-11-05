// src/view/CLI.java

package view;

import controller.SmartHomeController;
import java.util.Scanner;

public class CLI {
    private SmartHomeController controller;
    private Scanner scanner;

    public CLI() {
        controller = SmartHomeController.getInstance();
        scanner = new Scanner(System.in);
    }

    public void mainMenu() {
        while (true) {
            System.out.println("\n--- Smart Home Automation Hub ---");
            System.out.println("1. Add Device");
            System.out.println("2. Control Device");
            System.out.println("3. List Devices");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    addDevice();
                    break;
                case "2":
                    controlDevice();
                    break;
                case "3":
                    controller.listDevices();
                    break;
                case "4":
                    System.out.println("Exiting Smart Home Automation Hub.");
                    return;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }

    private void addDevice() {
        System.out.print("Enter device type (light/thermostat/camera): ");
        String type = scanner.nextLine();
        System.out.print("Enter device name: ");
        String name = scanner.nextLine();
        controller.addDevice(type, name);
    }

    private void controlDevice() {
        System.out.print("Enter the name of the device to control: ");
        String name = scanner.nextLine();
        System.out.print("Enter action (on/off): ");
        String action = scanner.nextLine();
        controller.controlDevice(name, action);
    }
}
