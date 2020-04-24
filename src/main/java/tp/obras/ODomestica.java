package tp.obras;

import java.util.ArrayList;

import tp.Empleado;
import tp.Obra;

public class ODomestica extends Obra {
    private int habitaciones;

    public ODomestica(String direccion, int mCuadrados, int estimado, double costoPorM, ArrayList<Empleado> personal, int habitaciones) {
        super(direccion, mCuadrados, estimado, costoPorM, personal);
        this.habitaciones = habitaciones;
    }

    public int getHabitaciones() {
        return habitaciones;
    }

}