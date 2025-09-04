package Ex_04;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Palindromo palin = new Palindromo();

        System.out.println("Digite uma palavra: ");
        String palavra = scanner.nextLine();

        boolean resultado = palin.ehPalindromo(palavra);

        if (resultado) {
            System.out.println("O resultado é: É um palíndromo!");
        } else {
            System.out.println("O resultado é: Não é um palíndromo.");
        }
        scanner.close();
    }
}
