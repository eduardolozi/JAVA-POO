package associacao.dominio;

public class Professor {
    private String nome, especialidade;
    private Seminario[] seminarios;

    public Professor() { }

    public Professor(String nome, String especialidade) {
        this.nome = nome;
        this.especialidade = especialidade;
    }

    public void imprime() {
        System.out.println("------------");
        System.out.println(this.nome + ": " + this.especialidade);
        System.out.println("Seminarios: ");
        for (Seminario seminario : seminarios) {
            System.out.println(seminario.getTitulo() + ": " + seminario.getLocal().getEndereco());
            System.out.println("Alunos do seminario: ");
            for(Aluno alunos: seminario.getAlunos()) {
                System.out.println(alunos.getNome() + " " + alunos.getIdade());
            }
        }
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }
    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public Seminario[] getSeminarios() {
        return seminarios;
    }
    public void setSeminarios(Seminario[] seminarios) {
        this.seminarios = seminarios;
    }
    
}
