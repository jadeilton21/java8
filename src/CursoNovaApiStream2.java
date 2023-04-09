import java.util.ArrayList;
import java.util.List;

public class CursoNovaApiStream2 {


    private String nome;
    private int alunos;


    public CursoNovaApiStream2(String nome, int alunos) {
        this.nome = nome;
        this.alunos = alunos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAlunos() {
        return alunos;
    }

    public void setAlunos(int alunos) {
        this.alunos = alunos;
    }
}class TestandoClasse {
    public static void main(String[] args) {

        List<CursoNovaApiStream2> cursos = new ArrayList<>();
        cursos.add(new CursoNovaApiStream2("Java",300));
        cursos.add(new CursoNovaApiStream2("Python", 234));
        cursos.add(new CursoNovaApiStream2("C",232));
        cursos.add(new CursoNovaApiStream2("C++",344));
        cursos.add(new CursoNovaApiStream2("Frotar",322));


        cursos.stream()
                .filter(c -> c.getAlunos() > 200)
                .forEach(c -> System.out.println(c.getAlunos()));


        cursos.stream()
                .filter(c -> c.getAlunos() > 210)
                .map(c -> c.getNome())
                .forEach(c -> System.out.println(c));


        cursos.stream()
                .filter(c -> c.getAlunos() > 300)
                .map(CursoNovaApiStream2::getAlunos)
                .forEach(System.out::println);
        cursos.parallelStream()
                .filter(cursos4 -> cursos4.getAlunos() > 100)
                .findAny()
                .ifPresent(c -> System.out.println(c.getAlunos()));
    }

}