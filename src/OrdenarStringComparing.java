import java.util.ArrayList;
import java.util.List;

import static java.util.Comparator.comparing;

public class OrdenarStringComparing {


    public static void main(String[] args) {



        List<String> nomes = new ArrayList<>();
        nomes.add("Jadeilton");
        nomes.add("Jade");
        nomes.add("Paulo");
        nomes.add("Guilherme");
        nomes.add("Gilvaneo");


        nomes.sort(comparing(String::length));
        System.out.println(nomes);

        List<Integer>   numeros = new ArrayList<>();
        numeros.add(2);
        numeros.add(1);
        numeros.add(5);
        numeros.add(4);


        numeros.sort(comparing(Integer::intValue));
        System.out.println(numeros);
    }
}
