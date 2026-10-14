
package Question_3;

public class Main {

    public static void main(String[] args) {

        IO.println("================================");
        IO.println("     VEHICLE MANAGEMENT SYSTEM");
        IO.println("================================");

        Car car = new Car("GJ01AB1234", "Honda");

        IO.println("\n--- CAR DETAILS ---");
        car.displayDetails();
        car.start();
        car.service();

        Bike bike = new Bike("GJ01CD5678", "Yamaha");

        IO.println("\n--- BIKE DETAILS ---");
        bike.displayDetails();
        bike.start();
        bike.service();

        IO.println("\n================================");
        IO.println("  VEHICLE DETAILS COMPLETED");
        IO.println("================================");
    }
}
