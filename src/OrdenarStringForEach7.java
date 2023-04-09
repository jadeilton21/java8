import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class OrdenarStringForEach7 {


    public static void main(String[] args) {



        List<String> nomes = new ArrayList<>();
        nomes.add("Jadeilton");
        nomes.add("Gostoso");
        nomes.add("Lindão");
        nomes.add("Fofinho");
        nomes.add("Sabedoria");
        nomes.add("Ganja");




//        nomes.forEach(n -> System.out.println(n));


//        nomes.sort((n1,n2)-> Integer.compare(n1.length(),n2.length()));
//        System.out.println(nomes);


//        nomes.sort(Comparator.comparing(n -> n.length()));
//        System.out.println(nomes);
        nomes.sort(Comparator.comparing(String::length));
        System.out.println(nomes);


    }
}
