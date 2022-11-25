package Modells;

public class Equipo {
    private String id;
    private String nombre;
    private int titulos_nacionales;
    private int titulos_internacionales;
    private int puntos;
    private int goles_favor;
    private int goles_contra;
    private int partidos;
    private Tecnico mitecnico;

    public Equipo(String id, String nombre, int titulos_nacionales, int titulos_internacionales, int puntos, int goles_favor, int goles_contra, int partidos) {
        this.id = id;
        this.nombre = nombre;
        this.titulos_nacionales = titulos_nacionales;
        this.titulos_internacionales = titulos_internacionales;
        this.puntos = puntos;
        this.goles_favor = goles_favor;
        this.goles_contra = goles_contra;
        this.partidos = partidos;
    }

    public void agregarTecnico(Tecnico nuevotecnico){
        this.setMitecnico(nuevotecnico);
    }

    public Tecnico getMitecnico() {
        return mitecnico;
    }

    public void setMitecnico(Tecnico mitecnico) {
        this.mitecnico = mitecnico;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTitulos_nacionales() {
        return titulos_nacionales;
    }

    public void setTitulos_nacionales(int titulos_nacionales) {
        this.titulos_nacionales = titulos_nacionales;
    }

    public int getTitulos_internacionales() {
        return titulos_internacionales;
    }

    public void setTitulos_internacionales(int titulos_internacionales) {
        this.titulos_internacionales = titulos_internacionales;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    public int getGoles_favor() {
        return goles_favor;
    }

    public void setGoles_favor(int goles_favor) {
        this.goles_favor = goles_favor;
    }

    public int getGoles_contra() {
        return goles_contra;
    }

    public void setGoles_contra(int goles_contra) {
        this.goles_contra = goles_contra;
    }

    public int getPartidos() {
        return partidos;
    }

    public void setPartidos(int partidos) {
        this.partidos = partidos;
    }
}
