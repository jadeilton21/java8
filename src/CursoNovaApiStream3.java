import java.util.ArrayList;
import java.util.List;

public class CursoNovaApiStream3 {

    private String nome;
    private int aluno;

    public CursoNovaApiStream3(String nome, int aluno) {
        this.nome = nome;
        this.aluno = aluno;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAluno() {
        return aluno;
    }

    public void setAluno(int aluno) {
        this.aluno = aluno;
    }
}

class TestarClasse {

    public static void main(String[] args) {

        List<CursoNovaApiStream3> cursos = new ArrayList<>();
        cursos.add(new CursoNovaApiStream3("Java",234));
        cursos.add(new CursoNovaApiStream3("C",344));
        cursos.add(new CursoNovaApiStream3("Python", 344));
        cursos.add(new CursoNovaApiStream3("C++", 222));
        cursos.add(new CursoNovaApiStream3("Simula-68",433));
        cursos.add(new CursoNovaApiStream3("JavaScript",343));
        cursos.add(new CursoNovaApiStream3("Front-And",123));


        System.out.println("--> Primeira forma de Mostrar só os Números maiores que 200 Alunos:");

        cursos.stream()
                .filter(cursos2 -> cursos2.getAluno() > 200)
                .forEach(cursos3 -> System.out.println(cursos3.getAluno()));
        System.out.println("--> Segunda Forma de Mostrar os nomes: ");

        cursos.stream()
                .forEach(cursos5 -> System.out.println(cursos5.getNome()));

        System.out.println("--> Terceira Forma, Números maiores que 300 e nome: ");

        cursos.stream()
                .filter(c1 -> c1.getAluno() > 300)
                .forEach(c -> System.out.println(c));


    }
}
