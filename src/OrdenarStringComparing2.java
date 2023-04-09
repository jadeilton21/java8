import java.util.ArrayList;
import java.util.List;

import static java.util.Comparator.comparing;

public class OrdenarStringComparing2 {


    public static void main(String[] args) {





        List<String> nomes = new ArrayList<>();
        nomes.add("Jadeilton ");
        nomes.add("Faya");
        nomes.add("Ganjah");
        nomes.add("Maconheiro");
        nomes.add("Safadão");
        nomes.add("Ganjamafaia");



        nomes.sort(comparing(String::join));
        System.out.println(nomes);



        nomes.sort(comparing(String::format));
        System.out.println(nomes);




    }
}
