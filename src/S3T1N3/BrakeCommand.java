package S3T1N3;

public class BrakeCommand implements Command{
    private VehicleCommands vehicleBrake;
    public BrakeCommand(VehicleCommands vehicleAccelerate){
        this.vehicleBrake = vehicleAccelerate;
    }
    @Override
    public void execute() {
        vehicleBrake.brake();
    }
}
