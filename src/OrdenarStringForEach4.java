import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;

public class OrdenarStringForEach4 {


    public static void main(String[] args) {


        Set<String> nomes = new LinkedHashSet<>();
        nomes.add("Jadeilton");
        nomes.add("Luciano");
        nomes.add("Faya");
        nomes.add("Gostosãooo");
        nomes.add("Safadão");


        nomes.forEach(n-> System.out.println(n));

        System.out.println("--> Com a Interface Set não se da para usar o método Sort.");














    }
}
