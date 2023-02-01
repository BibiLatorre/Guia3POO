package entidades;

import java.util.ArrayList;

public class EstudianteServicio {
    private ArrayList<Estudiante> ListaEstudiantes;

    public EstudianteServicio() {
        this.ListaEstudiantes = new ArrayList<>();
    }

    public EstudianteServicio(ArrayList<Estudiante> estudiantes) {
        this.ListaEstudiantes = estudiantes;
    }
    public void CrearEstudiante (String nombre, Integer nota1, Integer nota2, Integer nota3){
        Estudiante estudiante = new Estudiante ();
        ArrayList<Integer>notas = new ArrayList<>();

        estudiante.setNombre(nombre);
        notas.add(nota1);
        notas.add(nota2);
        notas.add(nota3);
        estudiante.setNota(notas);

        AgregarEstudiante (estudiante);

    }
    public void AgregarEstudiante (Estudiante estudiante) {
        this.ListaEstudiantes.add(estudiante);
    }
    public void VerListado (){
        for (Estudiante estudiante: ListaEstudiantes) {
            System.out.println(estudiante.toString());
        }
    }
}
