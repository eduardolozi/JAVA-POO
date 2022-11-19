package associacao.dominio;

public class Seminario {
    private String titulo;
    private Aluno[] alunos;
    private Local local;

    public void imprime() {
        System.out.println("-------------------");
        System.out.println(this.titulo);
        System.out.println("Alunos:");
        for (Aluno aluno : alunos) {
            System.out.println(aluno.getNome() + " " + aluno.getIdade());
        }
    }

    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Aluno[] getAlunos() {
        return alunos;
    }
    public void setAlunos(Aluno[] alunos) {
        this.alunos = alunos;
    }

    public Local getLocal() {
        return local;
    }
    public void setLocal(Local local) {
        this.local = local;
    }

    
}
