import Entidades.ServicioContactos;

public class Main {
    public static void main(String[] args) {

        ServicioContactos servicioCarga = new ServicioContactos();
        servicioCarga.agregarContactos();
        System.out.println("Contactos cargados: ");
        servicioCarga.verListadodeContactos();
    }
}