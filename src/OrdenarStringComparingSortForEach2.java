import java.util.LinkedList;
import java.util.List;

public class OrdenarStringComparingSortForEach2 {


    public static void main(String[] args) {


        List<String> nomes = new LinkedList<>();
        nomes.add("Jade");
        nomes.add("Faya");
        nomes.add("Ganja");
        nomes.add("Maconha");
        nomes.add("Sureal");
        nomes.add("De 4 ");
        nomes.add("Gostosa");


        System.out.println("--> Primeira Formar Método sort: ");
        nomes.sort(String::compareTo);
        System.out.println(nomes);

        System.out.println("--> Primeira Forma Método ForEach: ");
        nomes.forEach(String::length);
        System.out.println(nomes);


        System.out.println("--> ");
    }
}
