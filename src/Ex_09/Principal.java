package Ex_09;

import java.util.List;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Permuta permuta = new Permuta();

        System.out.println("Digite uma palavra para permutar:");
        String palavra = scanner.next();

        List<String> resultados = permuta.gerarPermutacoes(palavra);

        System.out.println("Todas as permutações de '" + palavra + "':");
        for (String perm : resultados) {
            System.out.println(perm);
        }
        scanner.close();
    }
}