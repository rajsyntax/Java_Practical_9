package SmartVehicle_ManagementSystem;


import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);
    private static final ArrayList<Vehicle> fleet = new ArrayList<>();

    public static void main(String[] args) {
        int choice;

        do {
            displayMenu();
            choice = readInt("Enter your choice: ");

            try {
                switch (choice) {
                    case 1 -> addCar();
                    case 2 -> addBike();
                    case 3 -> addBus();
                    case 4 -> addElectricCar();
                    case 5 -> addElectricBike();
                    case 6 -> displayAllVehicles();
                    case 7 -> startVehicle();
                    case 8 -> stopVehicle();
                    case 9 -> chargeVehicle();
                    case 10 -> showGPS();
                    case 11 -> System.out.println("Exiting Vehicle Management System.");
                    default -> System.out.println("Invalid choice. Please try again.");
                }
            } catch (IllegalArgumentException e) {
                System.out.println("Input error: " + e.getMessage());
            } catch (Exception e) {
                System.out.println("Operation failed: " + e.getMessage());
            }

            System.out.println();
        } while (choice != 11);

        scanner.close();
    }

    private static void displayMenu() {
        System.out.println("======================================");
        System.out.println(" SMART VEHICLE MANAGEMENT SYSTEM");
        System.out.println("======================================");
        System.out.println("1.  Add Car");
        System.out.println("2.  Add Bike");
        System.out.println("3.  Add Bus");
        System.out.println("4.  Add Electric Car");
        System.out.println("5.  Add Electric Bike");
        System.out.println("6.  Display All Vehicles");
        System.out.println("7.  Start Vehicle");
        System.out.println("8.  Stop Vehicle");
        System.out.println("9.  Charge Vehicle");
        System.out.println("10. Show GPS Location");
        System.out.println("11. Exit");
        System.out.println("======================================");
    }

    private static void addCar() {
        String id = readText("Enter vehicle ID: ");
        String brand = readText("Enter brand: ");
        int speed = readInt("Enter speed (km/h): ");
        int doors = readInt("Enter number of doors: ");

        addVehicle(new Car(id, brand, speed, doors));
    }

    private static void addBike() {
        String id = readText("Enter vehicle ID: ");
        String brand = readText("Enter brand: ");
        int speed = readInt("Enter speed (km/h): ");
        String engineType = readText("Enter engine type: ");

        addVehicle(new Bike(id, brand, speed, engineType));
    }

    private static void addBus() {
        String id = readText("Enter vehicle ID: ");
        String brand = readText("Enter brand: ");
        int speed = readInt("Enter speed (km/h): ");
        int capacity = readInt("Enter passenger capacity: ");

        addVehicle(new Bus(id, brand, speed, capacity));
    }

    private static void addElectricCar() {
        String id = readText("Enter vehicle ID: ");
        String brand = readText("Enter brand: ");
        int speed = readInt("Enter speed (km/h): ");
        int doors = readInt("Enter number of doors: ");

        addVehicle(new ElectricCar(id, brand, speed, doors));
    }

    private static void addElectricBike() {
        String id = readText("Enter vehicle ID: ");
        String brand = readText("Enter brand: ");
        int speed = readInt("Enter speed (km/h): ");

        addVehicle(new ElectricBike(id, brand, speed));
    }

    private static void addVehicle(Vehicle vehicle) {
        if (findVehicle(vehicle.getVehicleId()) != null) {
            System.out.println("A vehicle with this ID already exists.");
            return;
        }

        fleet.add(vehicle);
        System.out.println("Vehicle added successfully.");
    }

    private static void displayAllVehicles() {
        if (fleet.isEmpty()) {
            System.out.println("No vehicles registered.");
            return;
        }

        System.out.println("\n========== VEHICLE FLEET ==========");

        for (Vehicle vehicle : fleet) {
            vehicle.displayDetails();
            System.out.println("-----------------------------------");
        }
    }

    private static void startVehicle() {
        Vehicle vehicle = getVehicleById();

        if (vehicle != null) {
            vehicle.start();
        }
    }

    private static void stopVehicle() {
        Vehicle vehicle = getVehicleById();

        if (vehicle != null) {
            vehicle.stop();
        }
    }

    private static void chargeVehicle() {
        Vehicle vehicle = getVehicleById();

        if (vehicle == null) {
            return;
        }

        if (vehicle instanceof Chargeable chargeable) {
            chargeable.charge();
        } else {
            System.out.println("This vehicle does not support charging.");
        }
    }

    private static void showGPS() {
        Vehicle vehicle = getVehicleById();

        if (vehicle == null) {
            return;
        }

        if (vehicle instanceof GPS gps) {
            gps.showLocation();
        } else {
            System.out.println("GPS is not available for this vehicle.");
        }
    }

    private static Vehicle getVehicleById() {
        if (fleet.isEmpty()) {
            System.out.println("No vehicles are registered yet.");
            return null;
        }

        String id = readText("Enter vehicle ID: ");
        Vehicle vehicle = findVehicle(id);

        if (vehicle == null) {
            System.out.println("Vehicle not found.");
        }

        return vehicle;
    }

    private static Vehicle findVehicle(String id) {
        for (Vehicle vehicle : fleet) {
            if (vehicle.getVehicleId().equalsIgnoreCase(id)) {
                return vehicle;
            }
        }

        return null;
    }

    private static String readText(String prompt) {
        System.out.print(prompt);
        String value = scanner.nextLine().trim();

        if (value.isEmpty()) {
            throw new IllegalArgumentException("Input cannot be empty.");
        }

        return value;
    }

    private static int readInt(String prompt) {
        System.out.print(prompt);
        String value = scanner.nextLine().trim();

        try {
            return Integer.parseInt(value);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Please enter a valid whole number.");
        }
    }
}

