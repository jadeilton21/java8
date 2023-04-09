import java.util.ArrayList;
import java.util.List;

public class OrdenarStringSort {


    public static void main(String[] args) {





        List<String> palavras = new ArrayList<>();
        palavras.add("Jadeilton");
        palavras.add("Ganjahh");
        palavras.add("Maconha");
        palavras.add("Fayaaa");
        palavras.add("Maconhada");
        palavras.add("Sorvete");




        palavras.sort(String.CASE_INSENSITIVE_ORDER);

        System.out.println(palavras);





        palavras.forEach(System.out::println);



    }
}
