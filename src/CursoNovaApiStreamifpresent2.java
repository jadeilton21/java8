import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CursoNovaApiStreamifpresent2 {


    private String cursos;
    private int alunos;


    public CursoNovaApiStreamifpresent2(String cursos, int alunos) {
        this.cursos = cursos;
        this.alunos = alunos;
    }


    public String getCursos() {
        return cursos;
    }

    public void setCursos(String cursos) {
        this.cursos = cursos;
    }

    public int getAlunos() {
        return alunos;
    }

    public void setAlunos(int alunos) {
        this.alunos = alunos;
    }
}

class TestarCursoNovaApi {


    public static void main(String[] args) {


    List<CursoNovaApiStreamifpresent2> cursos = new ArrayList<>();
    cursos.add(new CursoNovaApiStreamifpresent2("Java",233));
    cursos.add(new CursoNovaApiStreamifpresent2("Python",341));
    cursos.add(new CursoNovaApiStreamifpresent2("JavaScrpit",356));
    cursos.add(new CursoNovaApiStreamifpresent2("Simula-68",122));
    cursos.add(new CursoNovaApiStreamifpresent2("Mysql",56));



    Stream<CursoNovaApiStreamifpresent2> stream = cursos.parallelStream()
            .filter(cursos2 -> cursos2.getAlunos() > 50);

        System.out.println(stream);


        System.out.println("--> De outra Maneira: ");

        List<CursoNovaApiStreamifpresent2> cursosFiltrados = cursos.parallelStream()
                .filter(cursos3 -> cursos3.getAlunos() > 50)
                .collect(Collectors.toList());

        System.out.println(cursosFiltrados);


        System.out.println("--> UNICA FORMA QUE VAI..: ");


        Map map = cursos.parallelStream()
                .filter(cursos3 -> cursos3.getAlunos() > 59)
                .collect(Collectors.toMap(c -> c.getAlunos(), c -> c.getCursos()));

        System.out.println(map);

        System.out.println("--> Formas: ");
        Map map2 = cursos.parallelStream()
                .filter(cursos4 -> cursos4.getAlunos() > 100)
                .collect(Collectors.toMap(c -> c.getCursos(), c -> c.getAlunos()));

        System.out.println(map2);


        System.out.println("--> Mostrando cursos menores que 100 alunos: ");
        Map map3 = cursos.parallelStream()
                .filter(c -> c.getAlunos() < 100)
                .collect(Collectors.toMap(c -> c.getCursos(), c -> c.getAlunos()));

        System.out.println(map3);

        System.out.println("--> Cursos acima de 200 alunos: ");
        Map map4 = cursos.parallelStream()
                .filter(c -> c.getAlunos() > 200)
                .collect(Collectors.toMap(c -> c.getCursos(), c -> c.getAlunos()));

        System.out.println(map4);


        System.out.println(" Testando Loucura: ");
        Map map5 = cursos.parallelStream()
                .filter(c -> c.getAlunos() > 200)
                .collect(Collectors.toMap(c -> c.getCursos(), c -> c.getCursos()));
        System.out.println(map5);



        Map map6 = cursos.parallelStream()
                .filter(c -> c.getAlunos() > 50)
                .collect(Collectors.toMap(c -> c.getAlunos(), c -> c.getAlunos()));


        System.out.println(map6);

        List<CursoNovaApiStreamifpresent2>  cursoFinalidade = cursos.parallelStream()
                .filter( c -> c.getAlunos() > 100)
                .collect(Collectors.toList());
        System.out.println(cursoFinalidade);

        cursos.parallelStream()
                .filter(c -> c.getCursos() == " Java")
                .forEach(c -> System.out.println(c));

    }
}
