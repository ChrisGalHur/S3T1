package S3T1N3;

import java.util.ArrayList;

public class Parking {
    //Comandos para el parquing
    private StartCommand parkingStart;
    private AccelerateCommand parkingAccelerate;
    private BrakeCommand parkingBrake;

    //ArrayLists de comandos
    private final ArrayList<StartCommand> startCommands;
    private final ArrayList<AccelerateCommand> accelerateCommands ;
    private final ArrayList<BrakeCommand> brakeCommands ;

    public Parking() {
        this.startCommands = new ArrayList<>();
        this.accelerateCommands = new ArrayList<>();
        this.brakeCommands = new ArrayList<>();
    }

    public void addCommands(StartCommand parkingStart, AccelerateCommand parkingAccelerate, BrakeCommand parkingBrake){
        startCommands.add(parkingStart);
        accelerateCommands.add(parkingAccelerate);
        brakeCommands.add(parkingBrake);
    }

    public void startAll(){
        for (StartCommand start : startCommands) {
            start.execute();
        }
    }

    public void accelerateAll(){
        for (AccelerateCommand accelerate : accelerateCommands) {
            accelerate.execute();
        }
    }

    public void brakeAll() {
        for (BrakeCommand brake : brakeCommands) {
            brake.execute();
        }
    }
}
