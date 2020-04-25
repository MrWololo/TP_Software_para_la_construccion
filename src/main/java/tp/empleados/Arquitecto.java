package tp.empleados;

import tp.Empleado;

public class Arquitecto extends Empleado {

    private String matricula;

    public Arquitecto(String nombre, String dni, String telefono, String matricula) {
        super(nombre, dni, telefono, 2000);
        this.matricula = matricula;
    }

    public String getMatricula() {
        return this.matricula;
    }

    public String crearPlanos() {
        return "Creando mi proximo plano";
    }

    @Override
    public String toString() {
        return "Arquitecto: " + super.toString() + " matricula: " + getMatricula();
    }

}