package poo.acoplamento.dominio;

public class Pessoa {
    private String nome, sexo;
    private double[] medidas = new double[3];

    // O bloco de inicializaçao é executado antes dos construtores
    // Dessa forma todo objeto instanciado passa pelo bloco de inicializaçao

    {
        this.nome = "Josias";
    }

    public Pessoa(String nome, String sexo, double[] medidas) {
        this(nome, sexo);
        this.medidas = medidas;
    }

    public Pessoa(String nome, String sexo) {
        this.nome = nome;
        this.sexo = sexo;
    }

    public Pessoa() {

    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public double[] getMedidas() {
        return medidas;
    }
    public void setMedidas(double[] medidas) {
        this.medidas = medidas;
        System.out.println(this.medidas[0] + " " + this.medidas[1] + " " + this.medidas[2]);
    }

    
}
