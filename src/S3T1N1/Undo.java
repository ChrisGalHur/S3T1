package S3T1N1;

import java.util.ArrayList;

public class Undo {
    private static ArrayList<String> historial;
    private static Undo instancia;

    private Undo(){
        //System.out.println("Undo instanciat");
        historial = new ArrayList<>();
    }

    //Sinleton Pattern
    public static Undo getInstance(){
        if (instancia == null) {
            instancia = new Undo();
            //System.out.println("Nou Undo");
        }
        //System.out.println("Undo ya creat");
        return instancia;
    }

    public static void addHistorial(String entradaAñadir) {
        historial.add((historial.size()+1) + " " + entradaAñadir);
    }

    public static void imprimirHistorial() {
        System.out.println("Historial:");
        historial.forEach(System.out::println);
    }
}

