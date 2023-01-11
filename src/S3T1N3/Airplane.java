package S3T1N3;

public class Airplane extends Command{
    //Atributos
    String name;

    //Constructores
    public Airplane(String name) {
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
        System.out.println("Airplane " + this.name + " is starting.");
    }

    @Override
    public void accelerate() {
        System.out.println("Airplane " + this.name + " is accelerating.");
    }

    @Override
    public void brake() {
        System.out.println("Airplane " + this.name + " has braked.");
    }
}
