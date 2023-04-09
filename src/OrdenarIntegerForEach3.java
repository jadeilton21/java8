import java.util.ArrayList;
import java.util.List;

public class OrdenarIntegerForEach3 {


    public static void main(String[] args) {





        List<Integer> numerosDoidos = new ArrayList<>();

        numerosDoidos.add(2);
        numerosDoidos.add(1);
        numerosDoidos.add(5);
        numerosDoidos.add(9);
        numerosDoidos.add(10);
        numerosDoidos.add(3);
        numerosDoidos.add(4);
        numerosDoidos.add(7);



        numerosDoidos.forEach(nD -> System.out.println(nD));

        numerosDoidos.sort((n1,n2)-> n1.intValue() - n2.intValue());
        System.out.println(numerosDoidos);
    }
}
