package poo.modificadorestatico.dominio;

public class Anime {
    private static int[] episodios;
    private String nome;

    // O BLOCO DE INIT ESTATICO É EXECUTADO APENAS UMA VEZ, GASTANDO MENOS PROCESSAMENTO
    static{
        System.out.println("Dentro do bloco de inicializacao estatico!!!");
        episodios = new int[5];
        for(int i = 0; i < 5; i++) {
            episodios[i] = i + 1;
        }
    }

    public Anime(String nome) {
        this.nome = nome;
        for (int i : Anime.episodios) {
            System.out.println(i);
        }
    }

    public Anime() {}


    public static int[] getEpisodios() {
        return episodios;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    
}
