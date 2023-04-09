import java.util.ArrayList;
import java.util.List;

public class OrdenarStringForEach6 {


    public static void main(String[] args) {





        List<String> cores = new ArrayList<>();
        cores.add("Verde...");
        cores.add("Azul");
        cores.add("Vermelho");
        cores.add("Preto");
        cores.add("Azul Marinho");


        cores.forEach(c-> System.out.println(c));

        cores.sort((c1, c2) -> c1.length() - c2.length());
        System.out.println(cores);
    }
}
