import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenarStringForEach {


    public static void main(String[] args) {


        List<String> pessoas = new ArrayList<>();
        pessoas.add("Jade....");
        pessoas.add("Mulher Gostosa...");
        pessoas.add("Mulher de Fases");
        pessoas.add("Sou Gostoso...");

        pessoas.forEach(s -> System.out.println(s));



        pessoas.sort((s1,s2) -> Integer.compare(s1.length(), s2.length()));
        System.out.println(pessoas);



    }
}
