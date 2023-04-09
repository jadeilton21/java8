import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class OrdenarStringComparatorComparing {


    public static void main(String[] args) {



        List<String> pessoas = new ArrayList<>();


        pessoas.add("Mofayaaa");
        pessoas.add("Gramaa");
        pessoas.add("Doidãoo");
        pessoas.add("Safadãooo");
        pessoas.add("Lindão");
        pessoas.add("Marcela");
        pessoas.add("Adonias");
        pessoas.add("Cleber");
        pessoas.add("Jadeilton");
        pessoas.add("Jade");



        pessoas.sort(Comparator.comparing(p -> p.length()));


        System.out.println(pessoas);

        pessoas.sort(Comparator.comparing(s-> s.length()));

        pessoas.sort(Comparator.comparing(String::length));
        System.out.println(pessoas);
    }
}
