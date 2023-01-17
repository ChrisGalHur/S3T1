package S3T1N3;

public class Boat implements VehicleCommand {
    //Atributos
    String name;

    //Constructores
    public Boat(String name) {
        this.name = name;
    }

    //Getters
    public String getName() {
        return name;
    }

    //Setters
    public void setName(String name) {
        this.name = name;
    }

    //Métodos de la clase VehicleCommand
    @Override
    public void start() {
        System.out.println("Boat " + this.name + " is starting.");
    }

    @Override
    public void accelerate() {
        System.out.println("Boat " + this.name + " is accelerating.");
    }

    @Override
    public void brake() {
        System.out.println("Boat " + this.name + " has braked.");
    }
}
