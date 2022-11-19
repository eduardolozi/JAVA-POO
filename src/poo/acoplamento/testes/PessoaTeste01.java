package poo.acoplamento.testes;

import poo.acoplamento.dominio.Pessoa;

public class PessoaTeste01 {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        double medidas[] = {1.33, 2.12, 1.50};

        p1.setNome("Eduardo Lozano");
        p1.setSexo("Masculino");
        p1.setMedidas(medidas);

        System.out.println(p1.getNome());
        System.out.println(p1.getSexo());
        medidas = p1.getMedidas();
        for (double d : medidas) {
            System.out.println(d);
        }
        
    }
}
