package classes.data;

public class DataTeste {
    public static void main(String[] args) {
        Data d1 = new Data(3, 4, 2002);
        //d1.dia = 3;
        //d1.mes = 4;
        //d1.ano = 2002;

        var d2 = new Data();
        //d2.dia = 13;
        //d2.mes = 11;
        //d2.ano = 1999;

        System.out.printf("Eduardo: %s\n", d1.dataFormatada());   
        System.out.printf("Alejandro: %s\n", d2.dataFormatada());   
        
    }
    
}

