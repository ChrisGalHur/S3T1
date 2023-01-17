package S3T1N3;

public class Bicycle implements VehicleCommand {
    //Atributos
    String name;

    //Constructores
    public Bicycle(String name) {
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

    @Override
    public void start() {
        System.out.println("Bicycle " + this.name + " is starting.");
    }

    @Override
    public void accelerate() {
        System.out.println("Bicycle " + this.name + " is accelerating.");
    }

    @Override
    public void brake() {
        System.out.println("Bicycle " + this.name + " has braked.");
    }
}