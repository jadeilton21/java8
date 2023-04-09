import java.util.ArrayList;
import java.util.List;

public class CursoNovaApiStream4 {


    private String nomes;
    private int alunos;


    public CursoNovaApiStream4(String nomes, int alunos) {
        this.nomes = nomes;
        this.alunos = alunos;
    }

    public String getNomes() {
        return nomes;
    }

    public void setNomes(String nomes) {
        this.nomes = nomes;
    }

    public int getAlunos() {
        return alunos;
    }

    public void setAlunos(int alunos) {
        this.alunos = alunos;
    }
}
class TestandoClasseMain{

    public static void main(String[] args) {


        List<CursoNovaApiStream4> cursos = new ArrayList<>();
        cursos.add(new CursoNovaApiStream4("java", 344));
        cursos.add(new CursoNovaApiStream4("Python", 233));
        cursos.add(new CursoNovaApiStream4("C++", 212));
        cursos.add(new CursoNovaApiStream4("C",444));
        cursos.add(new CursoNovaApiStream4("Simula-68",100));
        cursos.add(new CursoNovaApiStream4("JavaScript",150));
        cursos.add(new CursoNovaApiStream4("Banco de Dados",190));


        System.out.println("--> Mostrar Cursos Acima de 100 Alunos: ");

        cursos.stream()
                .filter(cur -> cur.getAlunos() > 100)
                .map(cursos1 -> cursos1.getAlunos())
                .forEach(cursos1 -> System.out.println(cursos1));

        cursos.stream()
                .filter(cursos2 -> cursos2.getAlunos() > 100)
                .map(cursos2 -> cursos2.getNomes())
                .forEach(cursos2 -> System.out.println(cursos2));

        System.out.println("--> Mostrar Cursos Acima de 200 alunos: ");

        cursos.stream().filter(cursos4 -> cursos4.getAlunos() >= 200).map(cursos4 -> cursos4.getAlunos()).forEach(cursos4 -> System.out.println(cursos4));

        cursos.stream()
                .filter(cursos3 -> cursos3.getAlunos() >= 200)
                .map(cursos3 -> cursos3.getNomes())
                .forEach(cursos3 -> System.out.println(cursos3));


        System.out.println("--> Testando o MapInt: Positivo");


        int soma = cursos.stream()
                .filter(cursos6 -> cursos6.getAlunos() > 100)
                .mapToInt(CursoNovaApiStream4::getAlunos)
                .sum();

        int soma2 = soma + 2;

        System.out.println(soma2);


        System.out.println("--> Testando o MapInt: Negativo");

        int soma3 = cursos.stream()
                .filter(cursos7 -> cursos7.getAlunos() > 100)
                .mapToInt(CursoNovaApiStream4::getAlunos)
                .sum();


        int soma4 = soma3 - 2;

        System.out.println(soma4);

        System.out.println("--> Teste:");
        cursos.stream()
                .filter(cursoNovaApiStream4 -> cursoNovaApiStream4.getAlunos() > 200)
                .map(cursoNovaApiStream4 -> cursoNovaApiStream4.getAlunos())
                .forEach(c -> System.out.println(c));



    }




}

