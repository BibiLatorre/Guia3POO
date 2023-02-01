import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in).useDelimiter("\n");
        List<String> ListadoRazas = new ArrayList<String>();
        String fin = "";
        boolean coincide = false;

        do {

            System.out.println("Ingresa una raza de perro");
            String Raza = input.next();
            ListadoRazas.add(Raza);

            System.out.println("Si quieres cargar otra raza presiona la tecla S, de lo contrario, presiona cualquier otra tecla");
            fin = input.next();
        } while (fin.equalsIgnoreCase("S"));

        System.out.println("Las razas que ingresaste son: ");
        for (String listado : ListadoRazas){
            System.out.println(listado);
        }
        System.out.println("\n" +"Ingresa el nombre de la raza para eliminar del listado");
        String eliminar = input.next();
        Iterator <String> it= ListadoRazas.iterator();
        while (it.hasNext()){
            String item = it.next();
            if (item.equalsIgnoreCase(eliminar)){
    it.remove();
    coincide=true;

            }
            if (!coincide){
                System.out.println("\n" +"La raza ingresada no está en la lista");

            }
        }
        System.out.println("\n" + "La lista de razas actualizada quedó así: ");
        for (String listado : ListadoRazas){
            System.out.println(listado);
        }



    }

}