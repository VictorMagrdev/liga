package Modells;

public class Partido {
    private String id;
    private int goles_local;
    private int goles_visitante;
    private Arbitro miarbitro;
    public Partido(String id, int goles_local, int goles_visitante) {
        this.id = id;
        this.goles_local = goles_local;
        this.goles_visitante = goles_visitante;
    }

    public Arbitro getMiarbitro() {
        return miarbitro;
    }

    public void setMiarbitro(Arbitro miarbitro) {
        this.miarbitro = miarbitro;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getGoles_local() {
        return goles_local;
    }

    public void setGoles_local(int goles_local) {
        this.goles_local = goles_local;
    }

    public int getGoles_visitante() {
        return goles_visitante;
    }

    public void setGoles_visitante(int goles_visitante) {
        this.goles_visitante = goles_visitante;
    }
}
