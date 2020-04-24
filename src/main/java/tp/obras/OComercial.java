package tp.obras;

import java.util.ArrayList;

import tp.Empleado;
import tp.Obra;

public abstract class OComercial extends Obra {

    private String nombre;

    public OComercial(String direccion, int mCuadrados, int estimado, double costoPorM, ArrayList<Empleado> personal,
            String nombre) {
        super(nombre, mCuadrados, estimado, costoPorM, personal);
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

}