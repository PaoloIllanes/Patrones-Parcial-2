package strategy.ejercicio;


public class Empleado {
    private int date;
    private int ci;
    private String profesion;
    private String nombre;

    public Empleado(int date, int ci, String profesion , String nombre){
        this.date= date;
        this.ci= ci;
        this.profesion= profesion;
        this.nombre= nombre;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public int getCi() {
        return ci;
    }

    public void setCi(int ci) {
        this.ci = ci;
    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
