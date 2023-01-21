package S3T1N3;

public class AccelerateCommand implements Command{
    private VehicleCommands vehicleAccelerate;
    public AccelerateCommand(VehicleCommands vehicleAccelerate){
        this.vehicleAccelerate = vehicleAccelerate;
    }
    @Override
    public void execute() {
        vehicleAccelerate.accelerate();
    }
}
