import java.util.Collection;
import java.util.HashSet;

public class OrdenarStringForEach2 {


    public static void main(String[] args) {


        Collection<String> nomes = new HashSet<>();
        nomes.add("Jade");
        nomes.add("Gabriel");
        nomes.add("Pedro");
        nomes.add("Faya");
        nomes.add("Jadeilton");
        nomes.add("Marcela");
        nomes.add("Jorge");



        nomes.forEach(n -> System.out.println(n));


        System.out.println("--> Com Collection não se da pra usar o método Sort.");





    }
}
