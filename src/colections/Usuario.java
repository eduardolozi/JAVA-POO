package colections;

public class Usuario {
    String nome, email;

    Usuario(String nome) {
        this.nome = nome;
    }

    public boolean equals(Object obj) {
        Usuario user = (Usuario) obj;
        return user.nome.equals(this.nome);
    }
}
