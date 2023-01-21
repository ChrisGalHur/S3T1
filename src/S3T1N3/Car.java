package S3T1N3;

public class Car extends Vehicle implements VehicleCommands {
    public Car(String name) {
        super(name);
    }

    @Override
    public void start() {
        System.out.println(super.getName() + " is starting.");
    }

    @Override
    public void accelerate() {
        System.out.println(super.getName() + " is accelerating.");
    }

    @Override
    public void brake() {
        System.out.println(super.getName() + " is breaking.");
    }
}
