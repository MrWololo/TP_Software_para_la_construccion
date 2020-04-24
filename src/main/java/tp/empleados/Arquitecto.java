package tp.empleados;

import tp.Empleado;

public class Arquitecto extends Empleado{

    private int matricula;
  
    public Arquitecto(String nombre, String dni, String telefono, int matricula) {
        super(nombre, dni, telefono, 2000);
        this.matricula = matricula;
    }


    public int getMatricula() {
        return this.matricula;
    }

    public String creaPlanos() {
        return "Creando mi proximo plano";
    }


}