package tp;

import java.util.ArrayList;

public class Empresa {

    private String nombre;
    private ArrayList<Empleado> empleados = new ArrayList<>();
    private ArrayList<Obra> obrasHechas = new ArrayList<>();

    public Empresa(String nombre) {
        this.nombre = nombre;
    }

    public Empresa(String nombre, ArrayList<Empleado> empleados) {
        this.nombre = nombre;
        this.empleados = empleados;
    }

    public Empresa(String nombre, ArrayList<Empleado> empleados, ArrayList<Obra> obrasHechas) {
        this.nombre = nombre;
        this.empleados = empleados;
        this.obrasHechas = obrasHechas;
    }

    public String getNombre() {
        return this.nombre;
    }

    public ArrayList<Empleado> getEmpleados() {
        return this.empleados;
    }

    public ArrayList<Obra> getObrasHechas() {
        return this.obrasHechas;
    }

    public void nuevaObra(Obra obra) {
        this.obrasHechas.add(obra);
    }

    public void agregarObras(ArrayList<Obra> obras) {
        this.obrasHechas.addAll(obras);
    }

    public void setObras(ArrayList<Obra> obras) {
        this.obrasHechas = obras;
    }

}