package Modells;

public class Jugador extends Persona {
    private String nacionalidad;
    private String posicion;
    private int goles;
    private int salario;

    public Jugador(String id, String cedula, String nombre, String apellido, int edad, String id1, String nacionalidad, String posicion, int goles, int salario) {
        super(id, cedula, nombre, apellido, edad);
        this.nacionalidad = nacionalidad;
        this.posicion = posicion;
        this.goles = goles;
        this.salario = salario;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public int getGoles() {
        return goles;
    }

    public void setGoles(int goles) {
        this.goles = goles;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }
}
