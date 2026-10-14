package Extended_Question_3;

class Bike extends Vehicle implements Serviceable {

    Bike(String number, String brand) {
        super(number, brand);
    }

    @Override
    void start() {
        IO.println("Bike starts with self-start");
    }

    @Override
    public void service() {
        IO.println("Bike is being serviced");
    }
}