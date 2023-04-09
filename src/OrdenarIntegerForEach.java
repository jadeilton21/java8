import java.util.ArrayList;
import java.util.List;

public class OrdenarIntegerForEach {


    public static void main(String[] args) {


        List<Integer> numeros = new ArrayList<>();
        numeros.add(8);
        numeros.add(2);
        numeros.add(3);
        numeros.add(1);
        numeros.add(6);

        System.out.println("--> Usando o ForEach sem o método sort..");
        numeros.forEach(n-> System.out.println(n));

        System.out.println("--> Usando o Método Sort..");
        numeros.sort((n1, n2) -> Integer.compare(n1.intValue(), n2.intValue()));
        System.out.println(numeros);

        System.out.println("--> Usando o Método Sort mais Enxuto...");

        numeros.sort((n1, n2) -> n1.intValue() - n2.intValue());

        System.out.println(numeros);



    }
}
