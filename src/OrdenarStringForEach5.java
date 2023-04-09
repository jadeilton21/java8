import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class OrdenarStringForEach5 {


    public static void main(String[] args) {


        Queue<String> nomes = new LinkedList<>();
        nomes.add("jade");
        nomes.add("Faya");
        nomes.add(" Gostosos");


        nomes.forEach(n -> System.out.println(n));





    }
}
