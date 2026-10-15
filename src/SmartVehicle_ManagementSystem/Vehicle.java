package SmartVehicle_ManagementSystem;


public abstract class Vehicle {
    private String vehicleId;
    private String brand;
    private int speed;

    public Vehicle(String vehicleId, String brand, int speed) {
        setVehicleId(vehicleId);
        setBrand(brand);
        setSpeed(speed);
    }

    public String getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(String vehicleId) {
        if (vehicleId == null || vehicleId.isBlank()) {
            throw new IllegalArgumentException("Vehicle ID cannot be empty.");
        }
        this.vehicleId = vehicleId.trim();
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        if (brand == null || brand.isBlank()) {
            throw new IllegalArgumentException("Brand cannot be empty.");
        }
        this.brand = brand.trim();
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        if (speed < 0) {
            throw new IllegalArgumentException("Speed cannot be negative.");
        }
        this.speed = speed;
    }

    public abstract void start();

    public void stop() {
        System.out.println(brand + " (" + vehicleId + ") has stopped.");
    }

    public void displayDetails() {
        System.out.println("Vehicle ID : " + vehicleId);
        System.out.println("Brand      : " + brand);
        System.out.println("Speed      : " + speed + " km/h");
    }
}

