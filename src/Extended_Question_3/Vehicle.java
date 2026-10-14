package Extended_Question_3;

abstract class Vehicle {

    protected String number;
    protected String brand;

    Vehicle(String number, String brand) {
        this.number = number;
        this.brand = brand;
    }

    abstract void start();

    void displayDetails() {
        IO.println("Brand: " + brand);
        IO.println("Number: " + number);
    }
}