import entidades.EstudianteServicio;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        EstudianteServicio listaestudiantes = new EstudianteServicio();
        Integer nota1;
        Integer nota2;
        Integer nota3;
        String nombre;
        String fin= "";

        listaestudiantes.CrearEstudiante("Ana", 9, 9, 8);
        listaestudiantes.CrearEstudiante("Ema", 9, 9, 8);
        listaestudiantes.CrearEstudiante("Juan", 9, 9, 8);
        listaestudiantes.CrearEstudiante("Luis", 9, 9, 8);

        System.out.println("Ingresar nuevos estudiantes");
        do {
            System.out.println("Ingresa el nombre");
            nombre = leer.next();
            System.out.println("Digita la primera nota");
            nota1 = leer.nextInt();
            System.out.println("Digita la segunda nota");
            nota2 = leer.nextInt();
            System.out.println("Digita la tercera nota");
            nota3 = leer.nextInt();

            System.out.println("\n" + "Si vas a ingresar otro estudiante presiona S, de lo contrario, presiona cualquier otra tecla");
            fin = leer.next();
            listaestudiantes.CrearEstudiante(nombre, nota1, nota2, nota3);

        }while (fin.equalsIgnoreCase("S"));

        System.out.println("\n"+ "Lista de estudiantes: ");
        listaestudiantes.VerListado();

    }
}