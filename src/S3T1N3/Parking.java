package S3T1N3;

import java.util.ArrayList;

public class Parking {

    private final ArrayList<Command> vehicles;

    public Parking() {
        this.vehicles = new ArrayList<>();
    }

    public void addVehicle(Command vehicleAdd) {
        this.vehicles.add(vehicleAdd);
    }

    public void startAllVehicles() {
        for (Command vehicleStart : this.vehicles){
            vehicleStart.start();
        }
    }

    public void accelerateAllVehicles() {
        for (Command vehicleStart : this.vehicles){
            vehicleStart.accelerate();
        }
    }

    public void brakeAllVehicles() {
        for (Command vehicleStart : this.vehicles){
            vehicleStart.brake();
        }
    }
}
