
package Extended_Question_3;

public class ElectricCar extends Vehicle implements Serviceable, ElectricVehicle {

    ElectricCar(String number, String brand) {
        super(number, brand);
    }

    @Override
    void start() {
        IO.println("Electric car starts silently");
    }

    @Override
    public void service() {
        IO.println("Electric car is being serviced");
    }

    @Override
    public void chargeBattery() {
        IO.println("Electric car battery is charging");
    }
}
