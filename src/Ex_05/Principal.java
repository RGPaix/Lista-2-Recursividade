package Ex_05;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Inversor inversor = new Inversor();

        System.out.println("Digite uma palavra: ");
        String palavra = scanner.nextLine();

        String resultado = inversor.inverte(palavra);

        System.out.println("A palavra invertida é: " + resultado.toLowerCase());
    }
}
