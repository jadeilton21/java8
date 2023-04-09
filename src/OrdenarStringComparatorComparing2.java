import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class OrdenarStringComparatorComparing2 {


    public static void main(String[] args) {


        List<String> maconhas = new ArrayList<>();


        maconhas.add("Sativa-L");
        maconhas.add("Indica");
        maconhas.add("Rudelares");
        maconhas.add("Skunk");
        maconhas.add("Prensado");
        maconhas.add("Raxixe");
        maconhas.add("Raxixe Marroquino");


        System.out.println("--> Usando o Lambda para Mostrar todos da Listas: ");
        maconhas.forEach(m -> System.out.println(m));

        System.out.println("--> Usando o Lambda para deixar a lista em Ordem: ");
        maconhas.sort(Comparator.comparing(m -> m.length()));
        System.out.println(maconhas);

        System.out.println("--> Usando o Reference para deixar a lista em Ordem: ");
        maconhas.sort(Comparator.comparing(String::toString));
        System.out.println(maconhas);

    }
}
