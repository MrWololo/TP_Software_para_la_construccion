package tp.empleados;

import tp.Empleado;
import tp.empleados.interfaz.Construccion;

public class Obrero extends Empleado implements Construccion {

    private int edad;

    public Obrero(String nombre, String dni, String telefono, int edad) {
        super(nombre, dni, telefono, 1500);
        this.edad = edad;
    }

    public int getEdad() {
        return edad;
    }

    @Override
    public String construir() {
        return "Soy obrero y construyo";
    }

    @Override
    public String toString() {
        return "Obrero: " + super.toString() + " edad: " + getEdad();
    }

}