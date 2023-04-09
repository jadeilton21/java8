import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

class ComparadorDeStringTamanho3 implements Comparator<String> {

    @Override
    public int compare(String s1, String s2) {
        if(s1.length() < s2.length())
            return -1;
        if(s1.length() > s2.length())
            return 1;
        return 0;
    }
}
class ConsumidorDeString3 implements Consumer<String>{

    @Override
    public void accept(String s) {
        System.out.println(s);
    }
}

public class OrdenarStrings3 {


    public static void main(String[] args) {


        List<String> palavras = new ArrayList<>();

        palavras.add("Jadeilton faya");
        palavras.add("Eu gosto de Ervas");
        palavras.add("Jade");

        System.out.println("Primeiro Método: ");

        Collections.sort(palavras);
        System.out.println(palavras);


        System.out.println("Segundo Método: ");


        Comparator<String>  comparar = new ComparadorDeStringTamanho3();
        Collections.sort(palavras, comparar);
        System.out.println(palavras);


        System.out.println("Terceiro Método: ");

        Consumer<String> consumir = new ConsumidorDeString3();
        palavras.forEach(consumir);




    }
}
