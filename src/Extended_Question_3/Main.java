package Extended_Question_3;

public class Main {

    public static void main(String[] args) {

        IO.println("================================");
        IO.println(" EXTENDED VEHICLE MANAGEMENT");
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

        Truck truck = new Truck("GJ01EF9012", "Tata");

        IO.println("\n--- TRUCK DETAILS ---");
        truck.displayDetails();
        truck.start();
        truck.service();

        ElectricCar electricCar =
                new ElectricCar("GJ01EV1234", "Tesla");

        IO.println("\n--- ELECTRIC CAR DETAILS ---");
        electricCar.displayDetails();
        electricCar.start();
        electricCar.service();
        electricCar.chargeBattery();

        IO.println("\n================================");
        IO.println(" ALL VEHICLES PROCESSED");
        IO.println("================================");
    }
}