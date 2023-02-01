import com.sun.source.tree.NewArrayTree;

import java.awt.*;
import java.sql.ClientInfoStatus;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Integer> ListaNumeros = new ArrayList<Integer>();
        ListaNumeros.add(1);
        ListaNumeros.add(2);
        ListaNumeros.add(11);

        //para que imprima en forma de array:
        System.out.println(ListaNumeros);

        //para que imprima como listado:

        for (Integer valor : ListaNumeros) {
            System.out.println(valor);

        }
    }

}