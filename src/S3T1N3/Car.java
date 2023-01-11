package S3T1N3;

public class Car extends Command{
    //Atributos
    String name;

    //Constructores
    public Car(String name) {
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

    //Métodos de la clase Command
    @Override
    public void start() {
        System.out.println("Car " + this.name + " is starting.");
    }

    @Override
    public void accelerate() {
        System.out.println("Car " + this.name + " is accelerating.");
    }

    @Override
    public void brake() {
        System.out.println("Car " + this.name + " has braked.");
    }
}
