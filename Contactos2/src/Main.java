import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        ArrayList<String> ListaContactos = new ArrayList<String>();

        System.out.println("Digita la cantidad de contactos que vas a cargar");
        int Cantidad = input.nextInt();

        for (int i=0; i<Cantidad; i++) {
            System.out.println("Ingresa el nombre de contacto");
            String Nombre = input.next();
            ListaContactos.add (Nombre);
            System.out.println("Digita número de contacto");
            int Numero = input.nextInt();
            ListaContactos.add (String.valueOf(Numero));
        }
        System.out.println("Los contactos ingresados son: ");
        for (String elemento: ListaContactos){
            System.out.println(elemento);

        }

    }

}