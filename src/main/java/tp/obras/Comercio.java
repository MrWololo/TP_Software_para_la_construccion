package tp.obras;

import java.util.ArrayList;

import tp.Empleado;

public class Comercio extends OComercial {

    private String rubro;


    public Comercio(String direccion, int mCuadrados, int estimado, double costoPorM, ArrayList<Empleado> personal, String nombre, String rubro) {
        super(direccion, mCuadrados, estimado, costoPorM, personal, nombre);
        this.rubro = rubro;
    }

     
    public String getRubro() {
        return rubro;
    }

}