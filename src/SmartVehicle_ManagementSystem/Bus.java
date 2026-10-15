package SmartVehicle_ManagementSystem;


public class Bus extends Vehicle {
    private int capacity;

    public Bus(String vehicleId, String brand, int speed, int capacity) {
        super(vehicleId, brand, speed);

        if (capacity <= 0) {
            throw new IllegalArgumentException("Capacity must be positive.");
        }

        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    @Override
    public void start() {
        System.out.println("Bus " + getVehicleId() + " starts using ignition.");
    }

    @Override
    public void displayDetails() {
        System.out.println("\n--- Bus Details ---");
        super.displayDetails();
        System.out.println("Passenger Capacity: " + capacity);
    }
}
