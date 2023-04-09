import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CursoNovaApiStreamIfPresent4 {


    private String cursos;
    private int alunos;

    public CursoNovaApiStreamIfPresent4(String cursos, int alunos) {
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

class TestandoOmain2{


    public static void main(String[] args) {

        List<CursoNovaApiStream3> cursos = new ArrayList<>();
        cursos.add(new CursoNovaApiStream3("Java",234));
        cursos.add(new CursoNovaApiStream3("C",344));
        cursos.add(new CursoNovaApiStream3("Python", 344));
        cursos.add(new CursoNovaApiStream3("C++", 222));
        cursos.add(new CursoNovaApiStream3("Simula-68",433));
        cursos.add(new CursoNovaApiStream3("JavaScript",343));
        cursos.add(new CursoNovaApiStream3("Front-And",123));




        cursos.parallelStream()
                .filter(cursos1 -> cursos1.getAluno() > 100)
                .map(cursoNovaApiStream3 -> cursoNovaApiStream3.getAluno() )
                .forEach(System.out::println);



        Map map = cursos.parallelStream()
                .filter(curso1 -> curso1.getAluno() >200)
                .collect(Collectors.toMap(c -> c.getNome(), c -> c.getAluno()));

        System.out.println(map);
    }
}
