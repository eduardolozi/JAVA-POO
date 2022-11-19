package classes.refeicao;

public class Jantar {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Eduardo Lozano", 85.0);
        Comida c1 = new Comida("Arroz Branco", 0.50);
        Comida c2 = new Comida("Feijao carioca", 0.332);
        Comida c3 = new Comida("Bife", 0.85);
        
        System.out.println("Peso antes: " + p1.peso);
        p1.peso = p1.comer(p1.peso, c1.peso);
        System.out.println("Peso agora: " + p1.peso);
        p1.peso = p1.comer(p1.peso, c2.peso);
        p1.peso = p1.comer(p1.peso, c3.peso);
        System.out.println("Peso agora: " + p1.peso);

    }
}
