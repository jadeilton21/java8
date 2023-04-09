import java.util.ArrayList;
import java.util.List;

import static java.util.Comparator.comparing;
import static java.util.Comparator.comparingInt;

public class OrdenarIntegerSort {


    public static void main(String[] args) {



        List<Integer> numeracao = new ArrayList<>();

        numeracao.add(2);
        numeracao.add(1);
        numeracao.add(7);
        numeracao.add(3);
        numeracao.add(8);
        numeracao.add(4);
        numeracao.add(10);




        numeracao.sort(comparing(Integer::intValue));
        System.out.println(numeracao);



        numeracao.forEach(n -> System.out.println(n));



        numeracao.sort(comparingInt(Integer::intValue));
        System.out.println(numeracao);

        numeracao.forEach(System.out::println);

    }
}
