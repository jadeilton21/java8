import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class CursoNovaApiStreamIfpresent3 {


    private String cursos;
    private int alunos;


    public CursoNovaApiStreamIfpresent3(String cursos, int alunos) {
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

class TestandoNoMain{


    public static void main(String[] args) {


        List<CursoNovaApiStreamIfpresent3> cursos = new ArrayList<>();
        cursos.add(new CursoNovaApiStreamIfpresent3("Java",233));
        cursos.add(new CursoNovaApiStreamIfpresent3("Python",341));
        cursos.add(new CursoNovaApiStreamIfpresent3("JavaScrpit",356));
        cursos.add(new CursoNovaApiStreamIfpresent3("Simula-68",122));
        cursos.add(new CursoNovaApiStreamIfpresent3("Mysql",56));

        System.out.println("--> Testando FindFirst:");



         cursos.parallelStream()
                .filter(cursos1 -> cursos1.getAlunos() > 50)
                .findFirst()
                        .ifPresent(c -> System.out.println(c.getAlunos()));


        System.out.println("--> Segundo Teste: ");


        cursos.parallelStream()
                .filter(cursos2 -> cursos2.getAlunos() > 100)
                .findAny()
                .ifPresent(c -> System.out.println(c.getAlunos()));


        cursos.parallelStream()
                .filter(cursos3 -> cursos3.getCursos() == "Java")
                .findAny().
                ifPresent(c -> System.out.println(c.getCursos()));



        Map map = cursos.parallelStream()
                .filter(cursos4 -> cursos4.getCursos() == "Java")
                .collect(Collectors.toMap(c -> c.getCursos(), c -> c.getAlunos()));


        System.out.println(map);




        Map map2 = cursos.parallelStream()
                .filter(cursos5 -> cursos5.getCursos() == "Python")
                .collect(Collectors.toMap(c -> c.getCursos(), c -> c.getAlunos()));
        System.out.println(map2);

        System.out.println("--> Cursos com mais de 200 Alunos: ");
        cursos.parallelStream()
                .filter(cursos6 -> cursos6.getAlunos() > 200)
                .map(cursos6 -> cursos6.getCursos())
                .forEach(c -> System.out.println(c));

        System.out.println("--> CURSOS COM MAIS DE 300 ALUNOS: ");

        cursos.parallelStream()
                .filter(cursos7 -> cursos7.getAlunos() > 300)
                .map(cursos7 -> cursos7.getCursos())
                .forEach(c -> System.out.println(c));


        System.out.println("--> Cursos com mais de 100 Alunos: ");


        cursos.parallelStream()
                .filter(cursos8 -> cursos8.getAlunos() > 100)
                .map(cursos8 -> cursos8.getCursos())
                .forEach(c -> System.out.println(c));


        System.out.println("--> Cursos com mais de 50 alunos");


        cursos.parallelStream()
                .filter(cursos9 -> cursos9.getAlunos() > 50)
                .map(cursos9 -> cursos9.getCursos())
                .forEach(System.out::println);

        System.out.println("--> Cursos e Alunos com mais de 50:");
        Map map5 = cursos.parallelStream()
                .filter(cursos9 -> cursos9.getAlunos() > 50)
                .collect(Collectors.toMap(c -> c.getCursos(), c -> c.getAlunos()));
        System.out.println(map5);


        System.out.println("--> Cursos e Alunos com mais de 100: ");

        Map map4 = cursos.parallelStream()
                .filter(cursos10 -> cursos10.getAlunos() > 100)
                .collect(Collectors.toMap(c -> c.getCursos(), c -> c.getAlunos()));
        System.out.println(map4);

        System.out.println("--> Cursos e Alunos com mais de 200 Alunos: ");

        Map map6 = cursos.parallelStream()
                .filter(cursos11 -> cursos11.getAlunos() > 200)
                .collect(Collectors.toMap(c -> c.getCursos(),c -> c.getAlunos()));
        System.out.println(map6);

        System.out.println("--> Cursos e Alunos com mais de 300 Alunos: ");
        Map map7 = cursos.parallelStream()
                .filter(cursos12 -> cursos12.getAlunos() > 300)
                .collect(Collectors.toMap(c -> c.getCursos(), c -> c.getAlunos()));
                System.out.println(map7);

        System.out.println("Testando o ToMap: ");

                Map map8 = (Map) cursos.parallelStream()
                        .filter(cursos1 -> cursos1.getAlunos() > 100)
                        .collect(Collectors.toMap(c -> c.getAlunos(), c -> c.getCursos()));
        System.out.println(map8);

        System.out.println("========================================");
        cursos.parallelStream()
                .filter(c -> c.getAlunos() > 100)
                .map(c -> c.getCursos())
                .forEach(c -> System.out.println(c));












        cursos.parallelStream()
                .filter(cursos::equals)
                .map(cursoNovaApiStreamIfpresent3 -> cursoNovaApiStreamIfpresent3.getCursos())
                .forEach(System.out::println);


















    }



}