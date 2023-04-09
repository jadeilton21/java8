import java.util.LinkedList;
import java.util.List;

import static java.util.Comparator.comparing;

public class OrdenarIntegerComparing2 {


    public static void main(String[] args) {




        List<Integer> numeral = new LinkedList<>();

        numeral.add(1);
        numeral.add(5);
        numeral.add(3);
        numeral.add(2);
        numeral.add(8);
        numeral.add(9);
        numeral.add(10);




        numeral.sort(comparing(Integer::intValue));
        System.out.println(numeral);



        numeral.forEach(System.out::println);


    }
}
