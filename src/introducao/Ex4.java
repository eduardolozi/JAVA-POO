package introducao;
import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        int num, maior = 0, i;
        for(i=0;i<10;i++) {
            num = read.nextInt();
            if(i == 0) {
                maior = num;
                continue;
            }
            if(num > maior) maior = num;
        }
        System.out.println("O maior número é: " + maior);
        read.close();
    }
}
