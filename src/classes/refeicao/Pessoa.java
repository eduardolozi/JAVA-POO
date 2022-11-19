package classes.refeicao;

public class Pessoa {
    String nome;
    double peso;

    Pessoa() {
        
    }

    Pessoa(String nome, double peso) {
        this.nome = nome;
        this.peso = peso;
    }

    double comer(double pesoPessoa, double pesoComida) {
        return pesoPessoa + pesoComida;
    }
}
