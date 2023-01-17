package S3T1N3;

import java.util.ArrayList;

public class Parking {

    private final ArrayList<VehicleCommand> vehicles;

    public Parking() {
        this.vehicles = new ArrayList<>();
    }

    public void addVehicle(VehicleCommand vehicleAdd) {
        this.vehicles.add(vehicleAdd);
    }

    public void startAllVehicles() {
        for (VehicleCommand vehicleStart : this.vehicles){
            vehicleStart.start();
        }
    }

    public void accelerateAllVehicles() {
        for (VehicleCommand vehicleStart : this.vehicles){
            vehicleStart.accelerate();
        }
    }

    public void brakeAllVehicles() {
        for (VehicleCommand vehicleStart : this.vehicles){
            vehicleStart.brake();
        }
    }
}
