package Ex_09;

import java.util.ArrayList;
import java.util.List;

public class Permuta {
    private static int numeroPermutacao = 1;

    public static void permuta(String s) {
        if (s == null || s.isEmpty()) {
            System.out.println("String vazia ou nula - nenhuma permutação possível.");
            return;
        }

        numeroPermutacao = 1; // Reset do contador
        System.out.println("=== PERMUTAÇÕES DA PALAVRA: \"" + s + "\" ===");
        System.out.println("Total de permutações possíveis: " + calcularFatorial(s.length()));
        System.out.println("-".repeat(50));

        permutaRecursiva("", s);

        System.out.println("-".repeat(50));
        System.out.println("Total de permutações geradas: " + (numeroPermutacao - 1));
    }

    private static void permutaRecursiva(String prefixo, String sufixo) {
        if (sufixo.length() == 0) {
            System.out.println(numeroPermutacao + ". " + prefixo);
            numeroPermutacao++;
            return;
        }

        for (int i = 0; i < sufixo.length(); i++) {
            char caractereAtual = sufixo.charAt(i);
            String novoPrefixo = prefixo + caractereAtual;
            String novoSufixo = sufixo.substring(0, i) + sufixo.substring(i + 1);
            permutaRecursiva(novoPrefixo, novoSufixo);
        }
    }

    private static long calcularFatorial(int n) {
        if (n <= 1) return 1;
        long resultado = 1;
        for (int i = 2; i <= n; i++) {
            resultado *= i;
        }
        return resultado;
    }

    public static List<String> gerarPermutacoes(String s) {
        List<String> permutacoes = new ArrayList<>();
        if (s == null || s.isEmpty()) {
            return permutacoes;
        }
        gerarPermutacoesRecursiva("", s, permutacoes);
        return permutacoes;
    }

    private static void gerarPermutacoesRecursiva(String prefixo, String sufixo, List<String> resultado) {
        if (sufixo.length() == 0) {
            resultado.add(prefixo);
            return;
        }

        for (int i = 0; i < sufixo.length(); i++) {
            char caractereAtual = sufixo.charAt(i);
            String novoPrefixo = prefixo + caractereAtual;
            String novoSufixo = sufixo.substring(0, i) + sufixo.substring(i + 1);
            gerarPermutacoesRecursiva(novoPrefixo, novoSufixo, resultado);
        }
    }
}
