package poo.modificadorestatico.dominio;

public class Carro {
    private int velocidadeMax;
    public static int velocidadeLimite = 250; //a variavel static é da classe, ou seja, todos os objetos dela terao o msm valor
    private String marca;

    public int getVelocidadeMax() {
        return velocidadeMax;
    }
    public void setVelocidadeMax(int velocidadeMax) {
        this.velocidadeMax = velocidadeMax;
    }

    public static int getVelocidadeLimite() {
        return velocidadeLimite;
    }
    public static void setVelocidadeLimite(int velocidadeLimite) {
        Carro.velocidadeLimite = velocidadeLimite; //aqui nao é usado this pq static é um metodo de classe e nao de objeto
                                                   //o metodo static pode ser usado sem ter instanciado um unico objeto
    }

    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }

    
}
