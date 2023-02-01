import java.util.*;

public class MainNombres {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Object> Integer;
        List<String> ListaNombres =new ArrayList<>();

        System.out.println("Digita la cantidad de nombres que vas ingresar");
        int Cantidad =input.nextInt();
        for (int i=0; i<Cantidad;i++) {
            System.out.println("Escribe un nombre");
            String Nombre = input.next();
            ListaNombres.add(Nombre);
        }
        ListaNombres.remove(3);
        ListaNombres.remove(1);

        Collections.sort(ListaNombres);

        System.out.println("La lista tiene " + ListaNombres.size()+ " nombres");

        System.out.println("Los nombres que ingresaste son: ");
        for (String elemento:ListaNombres){
            System.out.println(elemento);
        }
    }

}