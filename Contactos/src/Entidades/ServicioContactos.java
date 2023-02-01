package Entidades;

import java.util.ArrayList;
import java.util.Scanner;

public class ServicioContactos {
    private ArrayList <Contactos> ListadeContactos;

    public ServicioContactos(ArrayList<Contactos> listadeContactos) {
        ListadeContactos = listadeContactos;
    }
    public ServicioContactos(){
        this.ListadeContactos=new ArrayList<>();
    }
    public Contactos crearContacto (String Nombre, long Numero) {
        Contactos contactos = new Contactos(Nombre, Numero);
        return contactos;
    }
        public ArrayList <Contactos> agregarContactos(){
            Scanner input = new Scanner(System.in).useDelimiter("\n");

            String fin="";

            do {
                System.out.println("Ingrese un nombre de contacto");
                String Nombre = input.next();
                System.out.println("Digite el número");
                long Numero = input.nextLong();

                ListadeContactos.add(crearContacto(Nombre, Numero));
                System.out.println("Si desea ingresar otro contacto presione S, de lo contrario presione cualquier otra tecla");
                fin= input.next();

        } while (fin.equalsIgnoreCase("S"));
            return ListadeContactos;
    }
    public void verListadodeContactos(){
        for (Contactos i: ListadeContactos
             ) {
            System.out.println(i);

        }
    }
}
