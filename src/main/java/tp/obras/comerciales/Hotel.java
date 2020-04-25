package tp.obras.comerciales;

import java.util.ArrayList;

import tp.Empleado;
import tp.obras.OComercial;

public class Hotel extends OComercial {
    private int pisos;

    public Hotel(String direccion, int mCuadrados, int estimado, double costoPorM, ArrayList<Empleado> personal,
            String nombre, int pisos) {
        super(direccion, mCuadrados, estimado, costoPorM, personal, nombre);
        this.pisos = pisos;
    }

    public int getPisos() {
        return pisos;
    }

    @Override
    public String toString() {
        return "Hotel: " + super.toString() + " pisos: " + getPisos();
    }

}