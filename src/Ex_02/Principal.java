package Ex_02;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Potencia potencia = new Potencia();

        System.out.println("Digite um valor a:");
        double a = scanner.nextInt();

        System.out.println("Digite um valor b:");
        int b = scanner.nextInt();

        double resultado = potencia.potencia(a, b);

        System.out.println("A potência de " + a + " elevado a " + b + " é: " + resultado);
        scanner.close();
    }
}