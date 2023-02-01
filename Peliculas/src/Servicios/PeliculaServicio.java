package Servicios;

import Entidades.Pelicula;

import java.util.ArrayList;
import java.util.Scanner;

public class PeliculaServicio {
    private ArrayList<Pelicula> ListadePeliculas;

    public PeliculaServicio(ArrayList<Pelicula> listadePeliculas) {
        ListadePeliculas = listadePeliculas;
    }

    public PeliculaServicio() {
        this.ListadePeliculas = new ArrayList<>();
    }
    public Pelicula crearPelicula (String Titulo, String Director, int Duracion) {
        Pelicula pelicula = new Pelicula(Titulo, Director, Duracion);
        return pelicula;
    }


    public ArrayList<Pelicula> AgregarPeliculas() {
        Scanner input = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese una película");
        String fin = "";

        do {
            System.out.println("Ingrese el título de la película");
            String titulo = input.next();
            System.out.println("Ingrese el director de la película");
            String director = input.next();
            System.out.println("Ingrese la duración de la película en horas");
            int duracion = input.nextInt();

            ListadePeliculas.add(crearPelicula(titulo, director, duracion));
            System.out.println("Si desea ingresar otra película presione la tecla S, de lo contratrio, presione cualquier otra tecla");
            fin= input.next();


        } while (fin.equalsIgnoreCase("s"));
        return ListadePeliculas;

    }
    public void verListadodePeliculas (){
        for (Pelicula i:ListadePeliculas
             ) {
            System.out.println(i);

        }
    }

    public void PeliculasMayores2Horas(){
        for (Pelicula i: ListadePeliculas
             ) {
            if (i.getDuracion()>=2){
                System.out.println(i);
            }

        }
    }
    public void PeliculasMenor2Horas(){
        for (Pelicula i: ListadePeliculas
             ) {
            if (i.getDuracion()<2){
                System.out.println(i);
            }
        }
    }

}
