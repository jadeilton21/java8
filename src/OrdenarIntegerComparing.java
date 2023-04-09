import java.util.ArrayList;
import java.util.List;

import static java.util.Comparator.comparing;

public class OrdenarIntegerComparing {


    public static void main(String[] args) {





        List<Integer> numeros = new ArrayList<>();
        numeros.add(1);
        numeros.add(3);
        numeros.add(6);
        numeros.add(2);
        numeros.add(10);
        numeros.add(5);



        numeros.sort(comparing(Integer::intValue));
        System.out.println(numeros);


        numeros.forEach(System.out::println);


     }
}
