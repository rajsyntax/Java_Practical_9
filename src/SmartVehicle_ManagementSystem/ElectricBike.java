package SmartVehicle_ManagementSystem;


public class ElectricBike extends Vehicle implements Chargeable, GPS {

    public ElectricBike(String vehicleId, String brand, int speed) {
        super(vehicleId, brand, speed);
    }

    @Override
    public void start() {
        System.out.println("Electric bike " + getVehicleId()
                + " starts using its electric motor.");
    }

    @Override
    public void charge() {
        System.out.println("Charging electric bike " + getVehicleId() + ".");
    }

    @Override
    public void showLocation() {
        System.out.println("GPS location for electric bike "
                + getVehicleId() + ": 23.0225, 72.5714");
    }

    @Override
    public void displayDetails() {
        System.out.println("\n--- Electric Bike Details ---");
        super.displayDetails();
        System.out.println("Charging: Supported");
        System.out.println("GPS: Supported");
    }
}

