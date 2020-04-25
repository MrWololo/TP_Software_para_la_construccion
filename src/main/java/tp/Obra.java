package tp;

import java.util.ArrayList;

import tp.empleados.Arquitecto;
import tp.empleados.Maestro;
import tp.empleados.Obrero;

public abstract class Obra {

    private String direccion;
    private int mCuadrados;
    private int tEstimado;
    private double costoPorM;
    private ArrayList<Empleado> personal = new ArrayList<>();

    public Obra(String direccion, int mCuadrados, int estimado, double costoPorM, ArrayList<Empleado> personal) {
        if (limitCheck(personal)) {
            this.personal.addAll(personal);
            this.direccion = direccion;
            this.mCuadrados = mCuadrados;
            this.tEstimado = estimado;
            this.costoPorM = costoPorM;
        }

    }

    private boolean limitCheck(ArrayList<Empleado> lista) {

        long arquitectos = this.personal.stream().filter(c -> c instanceof Arquitecto).count();
        long nuevosArquitectos = lista.stream().filter(c -> c instanceof Arquitecto).count();
        long maestros = this.personal.stream().filter(c -> c instanceof Maestro).count();
        long nuevosMaestros = lista.stream().filter(c -> c instanceof Maestro).count();
        long obreros = this.personal.stream().filter(c -> c instanceof Obrero).count();
        long nuevosObreros = lista.stream().filter(c -> c instanceof Obrero).count();

        try {
            if (arquitectos + nuevosArquitectos > 1) {
                throw new Exception("Demasiados arquitectos");
            }

            if (maestros + nuevosMaestros > 3) {
                throw new Exception("Demasiados Maestros Mayores de obra");
            } else if (maestros + nuevosMaestros < 1) {
                throw new Exception("Se requiere por lo menos un Maestro Mayor de obra");
            }

            if (obreros + nuevosObreros < 2) {
                throw new Exception("Se requiere por lo menos dos obreros");
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return true;
    }

    public String getDireccion() {
        return this.direccion;
    }

    public int getMCuadrados() {
        return this.mCuadrados;
    }

    public int getTEstimado() {
        return this.tEstimado;
    }

    public double getCostoPorM() {
        return this.costoPorM;
    }

    public ArrayList<Empleado> getPersonal() {
        return this.personal;
    }

    public double precioTotal() {
        double costoEmpleados = 0;
        if (getPersonal() != null) {
            for (Empleado empleado : getPersonal()) {
                costoEmpleados += empleado.getCosto();
            }
        }

        return ((getCostoPorM() * getMCuadrados()) + (costoEmpleados * getTEstimado()));
    }

    @Override
    public String toString() {
        return "direccion: " + getDireccion() + ", metros cuadrados: " + getMCuadrados() + ", tiempo Estimado: "
                + getTEstimado() + ", costo Por Metro cuadrado: " + getCostoPorM();
    }

}