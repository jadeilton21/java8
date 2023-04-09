import java.util.ArrayList;
import java.util.List;

public class CursoNovaApiStream5 {


    private String curso;
    private int alunos;


    public CursoNovaApiStream5(String curso, int alunos) {
        this.curso = curso;
        this.alunos = alunos;
    }

    public int getAlunos() {
        return alunos;
    }

    public void setAlunos(int alunos) {
        this.alunos = alunos;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
}
class TestandoCursos{
    public static void main(String[] args) {

        List<CursoNovaApiStream5> cursos = new ArrayList<>();

        cursos.add(new CursoNovaApiStream5("Java",233));
        cursos.add(new CursoNovaApiStream5("Python",333));
        cursos.add(new CursoNovaApiStream5("C++",133));
        cursos.add(new CursoNovaApiStream5("Simula-68",433));
        cursos.add(new CursoNovaApiStream5("C",533));
        cursos.add(new CursoNovaApiStream5("JavaScript",833));
        cursos.add(new CursoNovaApiStream5("C" , 344));




        cursos.stream()
                .filter(cursos1 -> cursos1.getAlunos() > 200)
                .map(cursoNovaApiStream5 -> cursoNovaApiStream5.getCurso())
                .forEach(c -> System.out.println(c));

        cursos.stream()
                .filter(cursos2 -> cursos2.getCurso() == cursos2.getCurso())
                .map(cursoNovaApiStream5 -> cursoNovaApiStream5.getCurso())
                .forEach(c -> System.out.println(c));

        System.out.println("->> Cursos Java: ");
        cursos.stream()
                .filter(curso1 -> curso1.getCurso() == "Java")
                .map(cursoNovaApiStream5 -> cursoNovaApiStream5.getAlunos())
                .forEach(curso1 -> System.out.println("Alunos: " + curso1));


        System.out.println("--> Quantidade de alunos nos Cursos Java e Python: ");

        cursos.stream()
                .filter(cursoNovaApiStream5 -> cursoNovaApiStream5.getCurso() == "Java" + " Python")
                .map(cursoNovaApiStream5 -> cursoNovaApiStream5.getAlunos())
                .forEach(c -> System.out.println(c));

    }
}




