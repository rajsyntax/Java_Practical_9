package SmartVehicle_ManagementSystem;


public class Bike extends Vehicle {
    private String engineType;

    public Bike(String vehicleId, String brand, int speed, String engineType) {
        super(vehicleId, brand, speed);

        if (engineType == null || engineType.isBlank()) {
            throw new IllegalArgumentException("Engine type cannot be empty.");
        }

        this.engineType = engineType;
    }

    public String getEngineType() {
        return engineType;
    }

    @Override
    public void start() {
        System.out.println("Bike " + getVehicleId() + " starts using self-start.");
    }

    @Override
    public void displayDetails() {
        System.out.println("\n--- Bike Details ---");
        super.displayDetails();
        System.out.println("Engine Type: " + engineType);
    }
}

