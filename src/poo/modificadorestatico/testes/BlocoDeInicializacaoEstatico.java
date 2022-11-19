package poo.modificadorestatico.testes;

import poo.modificadorestatico.dominio.Anime;

public class BlocoDeInicializacaoEstatico {
    public static void main(String[] args) {
        Anime a1 = new Anime("Guatemala");
        Anime a2 = new Anime("Naruto");
        Anime a3 = new Anime("Bleach");

        //coloquei a impressao dos episodios para ser feita no construtor
        
    }
}
