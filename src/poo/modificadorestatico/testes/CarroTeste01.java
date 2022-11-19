package poo.modificadorestatico.testes;

import poo.modificadorestatico.dominio.Carro;

public class CarroTeste01 {
    public static void main(String[] args) {
        //É POSSIVEL ACESSAR METODOS E ATRIBUTOS ESTATICOS DE UMA CLASSE MESMO SEM INSTANCIAR OBJETOS
        Carro.velocidadeLimite = 250; 
        System.out.println(Carro.getVelocidadeLimite());
    }
}
