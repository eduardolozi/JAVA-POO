package arrays;

import java.util.Locale;
import java.util.Scanner;

public class Desafio1 {
    public static void main(String[] args) {
        int numero;
        float notaTotal = 0, media;
        Scanner read = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Quantas notas serão lidas? ");
        numero = read.nextInt();
        float[] notas = new float[numero];

        for(int i = 0; i < numero; i++) {
            System.out.printf("Nota %d: ", i + 1);
            notas[i] = read.nextFloat();
        }

        for(float nota : notas) {
            notaTotal += nota;
        }
        media = notaTotal / notas.length;
        System.out.println("A media da sala eh: " + media);
        
        read.close();
    }
}