package classes.data;

public class Data {
    public int dia, mes, ano;

    public Data() {
        this(1, 1, 1970);
    }

    Data(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    public String dataFormatada() {
        //String date = Integer.toString(dia).concat("/" + Integer.toString(mes) + "/" + Integer.toString(ano));
        //return date;
        return String.format("%d/%d/%d", dia, mes, ano);
    }
}
