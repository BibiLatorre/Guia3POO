package Entidades;

public class Pelicula {

    private String Titulo;
    private String Director;
    private int Duracion;

    public Pelicula() {
    }

    public Pelicula(String titulo, String director, int duracion) {
        this.Titulo = titulo;
        this.Director = director;
        Duracion = duracion;
    }




    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String titulo) {
        Titulo = titulo;
    }

    public String getDirector() {
        return Director;
    }

    public void setDirector(String director) {
        Director = director;
    }

    public int getDuracion() {
        return Duracion;
    }

    public void setDuracion(int duracion) {
        Duracion = duracion;
    }

    @Override
    public String toString() {
        return "Pelicula{" +
                "Titulo='" + Titulo + '\'' +
                ", Director='" + Director + '\'' +
                ", Duracion=" + Duracion +
                '}';
    }
}

