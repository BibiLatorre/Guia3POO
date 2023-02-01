import entidades.ProductoServicio;

public class Main {
    public static void main(String[] args) {

        ProductoServicio servicoCarga = new ProductoServicio();
        servicoCarga.AgregarProductos();
        System.out.println("Productos ingresados");
        servicoCarga.verListado();

        System.out.println("\n"+"Productos con precio mayor a 20");
        servicoCarga.MayorA20();

        System.out.println("\n"+"Prodcutos con precio menor a 100");
        servicoCarga.MenorA100();
    }
}