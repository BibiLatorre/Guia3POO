package entidades;

import javax.xml.catalog.Catalog;
import java.security.PublicKey;
import java.util.ArrayList;
import java.util.Scanner;

public class ProductoServicio {

    private ArrayList<Producto> ListaProductos;

    public ProductoServicio() {
        this.ListaProductos = new ArrayList<>();
    }

    public ProductoServicio(ArrayList<Producto> listaProductos) {
        this.ListaProductos = listaProductos;

    }

    public Producto CrearProducto(String Tipo, Integer Cantidad, Integer PrecioUnitario) {
        Producto producto = new Producto(Tipo, Cantidad, PrecioUnitario);
        return producto;
    }

    public ArrayList<Producto> AgregarProductos() {
        Scanner input = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingregar productos");
        String fin = "";

        do {
            System.out.println("Ingrese tipo de producto");
            String Tipo = input.next();
            System.out.println("Digite cantidad");
            int Cantidad = input.nextInt();
            System.out.println("Digite el precio unitario");
            int PrecioUnitario = input.nextInt();

            ListaProductos.add(CrearProducto(Tipo, Cantidad, PrecioUnitario));
            System.out.println("Si desea ingresar otro producto presione la tecla S, de lo contrario, presione cualquier otra tecla");
            fin = input.next();

        } while ((fin.equalsIgnoreCase("S")));
        return ListaProductos;
    }

    public void verListado() {
        for (Producto i : ListaProductos
        ) {
            System.out.println(i);


        }
    }

    public void MayorA20(){
        for (Producto i:ListaProductos) {
            if (i.getPrecioUnitario()>20){
                System.out.println(i);
            }

        }
    }

    public void MenorA100(){
        for (Producto i:ListaProductos
             ) {
            if (i.getPrecioUnitario()<100){
                System.out.println(i);
            }
        }
    }
}


