package S3T1N3;

public class S3T1N3Main {
    public static void main(String[]args) {
        /*Command
        Dissenya un pàrquing de 4 vehicles: un cotxe, una bicicleta, un avió i un vaixell.
        Mostra com funciona el patró Command que implementa els mètodes arrencar, accelerar i frenar per a cada tipus de vehicle.*/

        Parking parking1 = new Parking();

        parking1.addVehicle(new Car("Honda Civic"));
        parking1.addVehicle(new Bicycle("Orbea Occam"));
        parking1.addVehicle(new Airplane("Boeing 747"));
        parking1.addVehicle(new Boat("Black Pearl"));

        parking1.startAllVehicles();
        parking1.accelerateAllVehicles();
        parking1.brakeAllVehicles();
    }
}

