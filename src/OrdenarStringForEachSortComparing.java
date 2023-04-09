import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import static java.util.Comparator.comparing;

public class OrdenarStringForEachSortComparing {


    public static void main(String[] args) {




        List<String> nomes = new ArrayList<>();
        nomes.add("Jadeilton");
        nomes.add("Andre");
        nomes.add("Marcela");
        nomes.add("Thais");
        nomes.add("Thaina");
        nomes.add("Alice");
        nomes.add("Bernada");
        nomes.add("Brenda");
        nomes.add("Luana");
        nomes.add("Priscila");
        nomes.add("Eduarda");


        System.out.println("--> Mostrando a Lista com o Método ForEach: ");
        System.out.println("--> Primeira Forma: ");
        nomes.forEach( n -> System.out.println(n));

        System.out.println("--> Segunda Forma: ");
        nomes.forEach(System.out::println);


        System.out.println("--> Mostrando a Lista com o Método Sort: ");
        System.out.println("--> Primeira Forma: ");
        nomes.sort(comparing(String::length));
        System.out.println(nomes);
        System.out.println("--> Segunda Forma: ");
        nomes.sort(comparing(String::toString));
        System.out.println(nomes);



        













    }

}
