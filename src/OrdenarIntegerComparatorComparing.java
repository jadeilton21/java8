import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class OrdenarIntegerComparatorComparing {


    public static void main(String[] args) {


        List<Integer> numerais = new ArrayList<>();

        numerais.add(4);
        numerais.add(3);
        numerais.add(2);
        numerais.add(1);
        numerais.add(9);
        numerais.add(5);
        numerais.add(7);
        numerais.add(8);
        numerais.add(10);
        numerais.add(6);


        System.out.println("--> Primeiro exemplo usando ForEach dentro da Interface List:");
        numerais.forEach( n -> System.out.println(n));


        System.out.println("--> Segundo Exemplo usando o Sort com Lambdas: ");
        numerais.sort(Comparator.comparing(n -> n.intValue()));
        System.out.println(numerais);

        System.out.println("--> Terceiro Exemplo usando o Sort com o Reference: ");

        numerais.sort(Comparator.comparing(Integer::intValue));
        System.out.println(numerais);
    }
}
