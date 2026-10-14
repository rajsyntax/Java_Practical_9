package Extended_Question_3;

class Car extends Vehicle implements Serviceable {

    Car(String number, String brand) {
        super(number, brand);
    }

    @Override
    void start() {
        IO.println("Car starts with key/button");
    }

    @Override
    public void service() {
        IO.println("Car is being serviced");
    }
}