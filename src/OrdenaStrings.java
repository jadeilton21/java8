import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

class ComparadorDeStringsTamanho implements Comparator<String> {

    @Override
    public int compare(String s1, String s2) {
        if (s1.length() < s2.length())
            return -1;

        if (s1.length() > s2.length())
            return 1;

        return 0;
    }
}
class ConsumidorDeStrings implements Consumer<String>{

    @Override
    public void accept(String s) {
        System.out.println(s);
    }

}

public class OrdenaStrings {


    public static void main(String[] args) {


        List<String> palavras = new ArrayList<>();
        palavras.add("Jadeilton");
        palavras.add("Gostoso ponto net");
        palavras.add("a casa das primas...");


        Collections.sort(palavras);
        System.out.println(palavras);


        Comparator<String> comparator = new ComparadorDeStringsTamanho();
        Collections.sort(palavras, comparator);
        System.out.println(palavras);
        ;

        Comparator<String> comparator2 = new ComparadorDeStringsTamanho();
        palavras.sort(comparator2);


        Consumer<String> consumir = new ConsumidorDeStrings();
        palavras.forEach(consumir);


    }
}