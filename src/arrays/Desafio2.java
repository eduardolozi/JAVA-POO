package arrays;

import java.util.Locale;
import java.util.Scanner;

public class Desafio2 {
    public static void main(String[] args) {
        int numero, alunos;
        float notaTotal = 0, media;
        Scanner read = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Quantos alunos têm na sala? ");
        alunos = read.nextInt();
        System.out.print("Quantas notas serão lidas? ");
        numero = read.nextInt();
        float[][] notas = new float[alunos][numero];

        for(int i = 0; i < alunos; i++) {
            System.out.println("ALUNO " + (i + 1) + ":");
            for(int j = 0; j < numero; j++) {
                System.out.printf("Nota %d: ", j + 1);
                notas[i][j] = read.nextFloat();
            }
            System.out.println("-------------------------");
        }

        for(float nota[] : notas) {
            for (float nt : nota) {
                notaTotal += nt;
            }
        }
        media = notaTotal / (numero * alunos);
        System.out.println("A media da sala eh: " + media);

        read.close();
    }
}
