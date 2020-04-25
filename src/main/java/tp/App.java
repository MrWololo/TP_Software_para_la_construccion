package tp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import tp.empleados.Arquitecto;
import tp.empleados.Maestro;
import tp.empleados.Obrero;
import tp.obras.ODomestica;
import tp.obras.comerciales.Comercio;
import tp.obras.comerciales.Hotel;

public class App {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        ///////////////////////////////////////////////////////////// A

        Arquitecto arquitecto1 = new Arquitecto("Mauricio", "1000000", "+54 223-0000000", "1000");
        Maestro maestro1 = new Maestro("Jesus", "35000000", "+54 223-5459875", 35);
        Obrero obrero1 = new Obrero("Austin", "53006070", "+54 223-5687912", 26);
        Obrero obrero2 = new Obrero("Exhaustin", "50406420", "+11 223-3615618", 23);

        System.out.println(maestro1.construir());
        System.out.println(obrero1.construir());
        System.out.println(obrero2.construir());
        System.out.println(arquitecto1.crearPlanos());

        pToContinue(scan);

        ///////////////////////////////////////////////////////////// B

        ArrayList<Empleado> empleados = new ArrayList<>();
        Collections.addAll(empleados, arquitecto1, maestro1, obrero1, obrero2);
        Empresa empresa1 = new Empresa("Edificios S.A.", empleados);

        System.out.println("Creada Empresa");

        pToContinue(scan);

        ///////////////////////////////////////////////////////////// C

        ODomestica obraDomestica = new ODomestica("Direccion 1225", 40, 350, 300, empleados, 3);
        Hotel hotel = new Hotel("Address 4256", 70, 400, 7000, empleados, "Hotel hotel", 6);
        Comercio comercio = new Comercio("Jusho 9837", 80, 270, 600, empleados, "Ercio Com", "textil");

        System.out.println(
                "Nueva Obra: " + obraDomestica.toString() + "\nCosto Total: " + obraDomestica.precioTotal() + "\n");
        System.out.println("Nueva Obra: " + hotel.toString() + "\nCosto Total: " + hotel.precioTotal() + "\n");
        System.out.println("Nueva Obra: " + comercio.toString() + "\nCosto Total: " + comercio.precioTotal() + "\n");

        pToContinue(scan);

        ///////////////////////////////////////////////////////////// D

        ArrayList<Obra> obras = new ArrayList<>();
        Collections.addAll(obras, obraDomestica, hotel, comercio);
        empresa1.setObras(obras);

        System.out.println("Agregadas obras a la empresa");

        pToContinue(scan);

        ///////////////////////////////////////////////////////////// E

        System.out.println(hotel.personalToString());

        pToContinue(scan);

        scan.close();

    }

    public static void pToContinue(Scanner scan) {

        System.out.println("\nPresione una tecla para continuar...");
        scan.nextLine();

        
    }
}
