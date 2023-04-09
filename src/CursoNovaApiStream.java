import java.util.ArrayList;
import java.util.List;

public class CursoNovaApiStream {

    private String nome;
    private int alunos ;

    public CursoNovaApiStream(String nome, int alunos) {
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
}


