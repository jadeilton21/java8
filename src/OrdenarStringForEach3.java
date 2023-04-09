import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class OrdenarStringForEach3 {


    public static void main(String[] args) {


        List<String> palavras = new ArrayList<>();

        palavras.add("Jadeilton de Almeida");
        palavras.add("Gabriel Vignoto");
        palavras.add("Pedro Alcantera");
        palavras.add("Arthur Eduardo");
        palavras.add("Marcelo Caldeiras");


        palavras.forEach( p -> System.out.println(p));


        System.out.println("--> Comparação Enxuta..");
        palavras.sort((p1, p2) -> Integer.compare(p1.length(), p2.length()));
        System.out.println(palavras);

        System.out.println("--> Mais enxuto ainda....");
        palavras.sort((p1, p2) -> p1.length() - p2.length());
        System.out.println(palavras);


    }
}
