package tp.empleados;

import tp.Empleado;
import tp.empleados.interfaz.Construccion;

public class Maestro extends Empleado implements Construccion {

    private int edad;

    public Maestro(String nombre, String dni, String telefono, int edad) {
        super(nombre, dni, telefono, 1800);
        this.edad = edad;
    }

    public int getEdad() {
        return edad;
    }

    @Override
    public String construir() {
        return "Soy maestro y superviso las construcciones";
    }

    @Override
    public String toString() {
        return "Maestro: " + super.toString() + " edad: " + getEdad();
    }

}
