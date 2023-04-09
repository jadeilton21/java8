import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CursoNovaApiStreamifpresent {





    private String cursos;
    private int alunos;


    public CursoNovaApiStreamifpresent(String cursos, int alunos) {
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
class TestandoIfpresent{
    public static void main(String[] args) {


        List<CursoNovaApiStreamifpresent> cursos = new ArrayList<>();
        cursos.add(new CursoNovaApiStreamifpresent("PYTHON",233));
        cursos.add(new CursoNovaApiStreamifpresent("Java",223));
        cursos.add(new CursoNovaApiStreamifpresent("C",154));
        cursos.add(new CursoNovaApiStreamifpresent("C++",323));
        cursos.add(new CursoNovaApiStreamifpresent("Simula-68",456));
        cursos.add(new CursoNovaApiStreamifpresent("JavaScript",344));



        cursos.stream()
                .filter(cursos1 -> cursos1.getAlunos() > 100)
                .findAny()
                .ifPresent(cursos2 -> System.out.println(cursos2));


        System.out.println("--> Outra Forma de fazer o Stream em Códigos: ");


        Map map = cursos.parallelStream()
                .filter( c -> c.getAlunos() > 100)
                .collect(Collectors.toMap(c -> c.getCursos(), c -> c.getAlunos()));

        System.out.println(map);

        System.out.println("--> Mostrando: ");
        Map map2 = cursos.parallelStream()
                .filter(c -> c.getCursos() == "Java")
                .collect(Collectors.toMap(c -> c.getCursos(), c -> c.getAlunos()));

        System.out.println(map2);


        System.out.println("--> Média de Alunos: ");


        cursos.parallelStream()
                .mapToInt(cursos3 -> cursos3.getAlunos())
                .average();

        System.out.println(cursos);


        cursos.parallelStream()
                .filter(cursos6 -> cursos6.getAlunos() > 100)
                .findAny()
                .ifPresent(c -> System.out.println(c));











    }
}