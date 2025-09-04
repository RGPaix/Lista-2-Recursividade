package Ex_03;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Vetor vetor = new Vetor();

        System.out.println("Digite o tamanho do vetor:");
        int tamanho = scanner.nextInt();
        int[] v = new int[tamanho];

        for (int i = 0; i < tamanho; i++) {
            System.out.println("Digite o " + (i + 1) + "º elemento do vetor:");
            v[i] = scanner.nextInt();
        }

        int resultado = vetor.soma(v);

        System.out.println("O resultado da soma dos elementos do vetor é: " + resultado);
        scanner.close();
    }
}