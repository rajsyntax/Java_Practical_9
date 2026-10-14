package Extended_Question_3;

class Truck extends Vehicle implements Serviceable {

    Truck(String number, String brand) {
        super(number, brand);
    }

    @Override
    void start() {
        IO.println("Truck starts with ignition");
    }

    @Override
    public void service() {
        IO.println("Truck is being serviced");
    }
}