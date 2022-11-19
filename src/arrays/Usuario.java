package arrays;

public class Usuario {
    String nome, email;

    public boolean equals(Object obj) {
        Usuario user = (Usuario) obj;

        return (user.nome.equals(this.nome) && user.email.equals(this.email));
    }
}
