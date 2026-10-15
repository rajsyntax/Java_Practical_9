package SmartVehicle_ManagementSystem;


public class ElectricCar extends Vehicle implements Chargeable, GPS {
    private int numDoors;

    public ElectricCar(String vehicleId, String brand, int speed, int numDoors) {
        super(vehicleId, brand, speed);

        if (numDoors <= 0) {
            throw new IllegalArgumentException("Number of doors must be positive.");
        }

        this.numDoors = numDoors;
    }

    @Override
    public void start() {
        System.out.println("Electric car " + getVehicleId() + " starts silently.");
    }

    @Override
    public void charge() {
        System.out.println("Charging electric car " + getVehicleId() + ".");
    }

    @Override
    public void showLocation() {
        System.out.println("GPS location for electric car "
                + getVehicleId() + ": 23.0225, 72.5714");
    }

    @Override
    public void displayDetails() {
        System.out.println("\n--- Electric Car Details ---");
        super.displayDetails();
        System.out.println("Number of Doors: " + numDoors);
        System.out.println("Charging: Supported");
        System.out.println("GPS: Supported");
    }
}
