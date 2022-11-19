package introducao;
import java.util.Locale;
import java.util.Scanner;

public class Ex1 {
    
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        Locale localeBr = new Locale("pt", "BR");        
        int numero;
        numero = read.nextInt();
        
        if((numero >= 0 && numero <= 10) && numero % 2 == 0) {
            System.out.println("O numero " + numero + " é par.");
        } else if(numero > 10) {
            System.out.println("Número maior do que 10.");
        } else {
            System.out.println("O número " + numero + " nao é par");
        }
        

        read.close();
    }
}
