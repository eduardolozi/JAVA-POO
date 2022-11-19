package classes;

import classes.data.Data;

public class ValorVsReferencia {
    public static void main(String[] args) {
        Data d1 = new Data();

        System.out.println(d1.dataFormatada());
        Data d2 = d1; // atribuição por referencia, d1 e d2 vao apontar para a mesma regiao de memoria
        d2.dia = 30; // mudando em d2, mudamos d1 ao msm tempo

        System.out.println(d1.dataFormatada()); 
        System.out.println(d2.dataFormatada()); 
        
        // funcoes em que mandamos um objeto como parametro, trabalham com ele por referencia
        // ex: mudarData(d1)
    }
}
