package principal;

// CLASE PRINCIPAL.
import clases.*;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Creacion creacion = new Creacion(); // Director.
        PjBuilder Magobuilder = new MagoBuilder();
        PjBuilder Guerrerobuilder = new GuerreroBuilder();
        PjBuilder Chamanbuilder = new ChamanBuilder();
        int persona;
        System.out.println("personaje a crear:");
        System.out.println("1. mago");
        System.out.println("2. guerrero");
        System.out.println("3. Chamán");
        System.out.println("..................................");

        Scanner entrada = new Scanner(System.in);
        persona=entrada.nextInt();
        switch (persona) {
            case 1:
                creacion.setPjBuilder(Magobuilder);
                
                break;
            case 2:
                creacion.setPjBuilder(Guerrerobuilder);
                break;
            case 3:
                creacion.setPjBuilder(Chamanbuilder);
                break;
            default:
            // code block
        }
        creacion.construirPJ();
        pj nuevo = creacion.getPj();
    }
}
