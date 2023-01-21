package S3T1N3;

public class StartCommand implements Command{
    private VehicleCommands vehicleStart;
    public StartCommand(VehicleCommands vehicleAccelerate){
        this.vehicleStart = vehicleAccelerate;
    }
    @Override
    public void execute() {
        vehicleStart.start();
    }
}
