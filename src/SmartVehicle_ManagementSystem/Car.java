package SmartVehicle_ManagementSystem;


public class Car extends Vehicle {
    private int numDoors;

    public Car(String vehicleId, String brand, int speed, int numDoors) {
        super(vehicleId, brand, speed);

        if (numDoors <= 0) {
            throw new IllegalArgumentException("Number of doors must be positive.");
        }

        this.numDoors = numDoors;
    }

    public int getNumDoors() {
        return numDoors;
    }

    @Override
    public void start() {
        System.out.println("Car " + getVehicleId() + " starts with a key.");
    }

    @Override
    public void displayDetails() {
        System.out.println("\n--- Car Details ---");
        super.displayDetails();
        System.out.println("Number of Doors: " + numDoors);
    }
}

