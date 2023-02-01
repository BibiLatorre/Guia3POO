import Servicios.PeliculaServicio;
import Entidades.Pelicula;

public class Main {
    public static void main(String[] args) {

        PeliculaServicio servicioCarga = new PeliculaServicio();
        servicioCarga.AgregarPeliculas();
        System.out.println("Películas cargadas: ");
        servicioCarga.verListadodePeliculas();
        System.out.println(("\n")+"Películas con duración mayor a 2 horas: ");
        servicioCarga.PeliculasMayores2Horas();
        System.out.println(("\n")+ "Películas con duración menor a 2 horas: ");
        servicioCarga.PeliculasMenor2Horas();
    }
}