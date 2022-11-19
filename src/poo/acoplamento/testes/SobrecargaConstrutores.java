package poo.acoplamento.testes;

import poo.acoplamento.dominio.Pessoa;

public class SobrecargaConstrutores {
    public static void main(String[] args) {
        double[] vet = {1.29, 3.22, 1.56};
        Pessoa p1 = new Pessoa("Andre", "Homem", vet);

        for(double d: p1.getMedidas()) {
            System.out.println(d);
        }
    }
}