import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

import static java.util.Comparator.comparing;

public class OrdenarIntegerForEachSortComparing {


    public static void main(String[] args) {

        List<Integer> numeros   = new LinkedList<>();
        numeros.add(4);
        numeros.add(2);
        numeros.add(1);
        numeros.add(6);
        numeros.add(3);
        numeros.add(9);
        numeros.add(7);
        numeros.add(10);


        numeros.forEach(n-> System.out.println(n));


        numeros.sort(comparing(Integer::intValue));
        System.out.println(numeros);


        numeros.sort(comparing(Integer::intValue));
        System.out.println(numeros);


        System.out.println("--> ForEach Mais Facil:");

        numeros.forEach(System.out::println);


        System.out.println("--> Usando Sort: Método compareTo ");
        numeros.sort(Integer::compareTo);
        System.out.println(numeros);


        System.out.println("--> Usando o Método ForEach: ");
        numeros.forEach(Integer::intValue);
        System.out.println(numeros);


        System.out.println("Resultados Iguais usando o Método Sort e o Método ForEach: ");



        numeros.forEach(Integer::intValue);
        System.out.println(numeros);


        numeros.sort(Integer::compareTo);
        System.out.println(numeros);



    }
}
