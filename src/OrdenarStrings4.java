import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


class ComparadorDeStrings implements Comparator<Integer>{

    @Override
    public int compare(Integer s1, Integer s2) {
        if(s1.intValue() < s2.intValue())
            return -1;
        if(s1.intValue() > s2.intValue())
            return 1;
        return 0;
    }
}

public class OrdenarStrings4 {



    public static void main(String[] args) {


        List<Integer> numeros = new ArrayList<>();
        numeros.add(4);
        numeros.add(8);
        numeros.add(3);
        numeros.add(2);

        System.out.println("Primeiro Método:");
        Collections.sort(numeros);
        System.out.println(numeros);

        System.out.println("Segundo Método: ");
        Comparator<Integer> comparator = new ComparadorDeStrings();


    }
}
