import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

public class OrdenarIntegerForEach2 {


    public static void main(String[] args) {


        System.out.println("--> Inteface Collections");


        List<Integer> numeros = new LinkedList<>();

        numeros.add(2);
        numeros.add(4);
        numeros.add(7);
        numeros.add(1);
        numeros.add(6);
        numeros.add(5);
        numeros.add(8);
        numeros.add(9);
        numeros.add(3);


        System.out.println("--> Método ForEach" );
        numeros.forEach(n -> System.out.println(n));

        System.out.println("--> Usando O Método Sort: ");
        numeros.sort((n1, n2) -> n1.intValue() - n2.intValue());
        System.out.println(numeros);


        System.out.println(" O método Sort Organiza a sequencia de String ou de Integer.. Não importa" +
                " como Foi Adicionado..");

    }
}
