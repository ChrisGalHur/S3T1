package S3T1N1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String dades = "";
        boolean sortir = false;
        Scanner scan = new Scanner(System.in);

        System.out.println("Bon día!\n"
                + "Introdueix dades:\n"
                + "- Per sortir introdueix 0.\n"
                + "- Per veure l'historial introdueix 1.");
        do {
            Undo.getInstance();
            dades = scan.next();
            if(dades.equalsIgnoreCase("0")) {
                sortir = true;
            }else if(dades.equalsIgnoreCase("1")) {
                Undo.imprimirHistorial();
            }else {
                Undo.addHistorial(dades);
            }
        }while(sortir == false);

    }

}