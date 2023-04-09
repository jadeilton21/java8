import java.util.ArrayList;
import java.util.List;

public class TestarCursoStream {


    public static void main(String[] args) {


        List<CursoNovaApiStream> cursos = new ArrayList<>();
        cursos.add(new CursoNovaApiStream("Java", 82));
        cursos.add(new CursoNovaApiStream("Python", 21));
        cursos.add(new CursoNovaApiStream("C", 120));




        cursos.stream()
                .filter(c -> c.getAlunos() > 50)
                .forEach(c -> System.out.println(c.getNome()));


    }


}
