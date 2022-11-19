package introducao;
import java.util.Locale;
import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        Locale localeBr = new Locale("pt", "BR");    
        
        int num, soma = 0;
        num = read.nextInt();
        while(num >= 0) {
            soma += num;
            System.out.println("SOMA: " + soma);
            num = read.nextInt();
        }
        read.close();
    }    
}
