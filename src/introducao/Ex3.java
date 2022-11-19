package introducao;
import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        String str = read.nextLine().trim();
        int tam = str.length();
        int i;
        for(i = 0;i < tam; i++) {
            System.out.printf("%c", str.charAt(i));
        }
        System.out.println();
        read.close();
    }    
}

