package S3T1N3;

public class S3T1N3Main {
    public static void main(String[]args) {
        /*Command
        Dissenya un pàrquing de 4 vehicles: un cotxe, una bicicleta, un avió i un vaixell.
        Mostra com funciona el patró Command que implementa els mètodes arrencar, accelerar i frenar per a cada tipus de vehicle.*/

        //Creamos un parking
        Parking parking1 = new Parking();

        //Creamos un coche y le damos commandos
        Car car1 = new Car("Honda");
        StartCommand startCar1 = new StartCommand(car1);
        AccelerateCommand accelerateCar1 = new AccelerateCommand(car1);
        BrakeCommand brakeCar1 = new BrakeCommand(car1);

        //El avión y le damos comandos
        Airplane airplane1 = new Airplane("Boeing");
        StartCommand startAirplane1 = new StartCommand(airplane1);
        AccelerateCommand accelerateAiplane1 = new AccelerateCommand(airplane1);
        BrakeCommand brakeAirplane1 = new BrakeCommand(airplane1);

        //La bicicleta y le damos comandos
        Bicycle bicycle1 = new Bicycle("Orbea");
        StartCommand startBicycle1 = new StartCommand(bicycle1);
        AccelerateCommand accelerateBicycle1 = new AccelerateCommand(bicycle1);
        BrakeCommand brakeBicycle1 = new BrakeCommand(bicycle1);

        //El barco y le damos comandos
        Boat boat1 = new Boat("Titanic");
        StartCommand startBoat1 = new StartCommand(boat1);
        AccelerateCommand accelerateBoat1 = new AccelerateCommand(boat1);
        BrakeCommand brakeBoat1 = new BrakeCommand(boat1);

        //Le enviamos al parking los comandos de todos los vehiculos
        parking1.addCommands(startCar1, accelerateCar1, brakeCar1);
        parking1.addCommands(startAirplane1, accelerateAiplane1, brakeAirplane1);
        parking1.addCommands(startBicycle1, accelerateBicycle1, brakeBicycle1);
        parking1.addCommands(startBoat1, accelerateBoat1, brakeBoat1);

        parking1.startAll();
        parking1.accelerateAll();
        parking1.brakeAll();

    }
}

