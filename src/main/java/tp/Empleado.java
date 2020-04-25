package tp;

public abstract class Empleado {

    private String nombre;
    private String dni;
    private String telefono;
    private double costo;

    public Empleado(String nombre, String dni, String telefono, double costo) {
        this.nombre = nombre;
        this.dni = dni;
        this.telefono = telefono;
        this.costo = costo;
    }

    public String getNombre() {
        return this.nombre;
    }

    public String getDni() {
        return this.dni;
    }

    public String getTelefono() {
        return this.telefono;
    }

    public double getCosto() {
        return this.costo;
    }

    @Override
    public String toString() {
        return "{" + " nombre='" + getNombre() + "'" + ", dni='" + getDni() + "'" + ", telefono='" + getTelefono() + "'"
                + ", costo='" + getCosto() + "'" + "}";
    }

}