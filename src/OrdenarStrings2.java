import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

class ComparadorDeStringsTamanho2 implements Comparator<String>{


    @Override
    public int compare(String s1, String s2) {
        if(s1.length() < s2.length())
            return -1;
        if(s1.length() > s2.length())
            return 1;
        return 0;
    }
}
class ConsumidorDeStrings2 implements Consumer<String>{

    @Override
    public void accept(String s) {
        System.out.println(s);
    }
}

public class OrdenarStrings2 {

    public static void main(String[] args) {




        List<String> palavras = new ArrayList<>();
        palavras.add("Jadeilton Gostoso");
        palavras.add("Gosto de mulher Gostosa");
        palavras.add("Maconha");


        Collections.sort(palavras);
        System.out.println(palavras);


        Comparator<String> comparator = new ComparadorDeStringsTamanho2();
        Collections.sort(palavras);

        Comparator<String> comparator2 = new ComparadorDeStringsTamanho2();
        palavras.sort(comparator2);

        Consumer<String> consumirString = new ConsumidorDeStrings2();
        palavras.forEach(consumirString);

    }
}
