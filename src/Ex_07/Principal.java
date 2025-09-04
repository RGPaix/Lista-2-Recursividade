package Ex_07;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BuscaBinaria buscaBinaria = new BuscaBinaria();

        System.out.println("Digite o tamanho do vetor:");
        int tamanho = scanner.nextInt();
        int[] v = new int[tamanho];

        for (int i = 0; i < tamanho; i++) {
            System.out.println("Digite o " + (i + 1) + "º elemento do vetor:");
            v[i] = scanner.nextInt();
        }

        System.out.println("Digite o valor que você quer encontrar:");
        int x = scanner.nextInt();

        int resultado = buscaBinaria.buscaBinaria(v, x);

        System.out.println("O valor " + x + " aparece na posição: " + resultado + " no vetor.");
        scanner.close();
    }
}
