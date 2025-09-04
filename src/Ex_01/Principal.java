package Ex_01;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Fibonacci fibonacci = new Fibonacci();

        System.out.println("Digite o termo de Fibonacci que você quer calcular (n >= 0):");
        int n = scanner.nextInt();

        if (n < 0) {
            System.out.println("Erro: O número deve ser maior ou igual a 0.");
        } else {
            long resultado = fibonacci.fib(n);
            System.out.println("O " + n + "-ésimo termo de Fibonacci é: " + resultado);
        }
        scanner.close();
    }
}
