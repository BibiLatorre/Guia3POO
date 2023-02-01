package Entidades;

public class Contactos {
    private String Nombre;
    private long Numero;

    public Contactos() {
    }

    public Contactos(String nombre, long numero) {
        this.Nombre = nombre;
        this.Numero = numero;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public long getNumero() {
        return Numero;
    }

    public void setNumero(long numero) {
        Numero = numero;
    }

    @Override
    public String toString() {
        return "Contactos{" +
                "Nombre='" + Nombre + '\'' +
                ", Numero=" + Numero +
                '}';
    }
}
