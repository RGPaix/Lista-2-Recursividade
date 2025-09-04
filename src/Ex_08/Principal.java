package Ex_08;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== TORRE DE HANOI ===");
        System.out.println();

        int n;
        do {
            System.out.print("Digite o número de discos (1-10): ");
            n = scanner.nextInt();

            if (n < 1 || n > 10) {
                System.out.println("⚠️  Por favor, digite um número entre 1 e 10.");
                System.out.println("   (Números maiores podem demorar muito tempo!)");
            }
        } while (n < 1 || n > 10);

        scanner.nextLine();

        System.out.println("\nDefina as hastes (use letras diferentes):");

        char origem, destino, auxiliar;

        do {
            System.out.print("Digite a haste de ORIGEM (ex: A): ");
            String input = scanner.nextLine().trim().toUpperCase();
            if (input.length() == 1) {
                origem = input.charAt(0);
                break;
            } else {
                System.out.println("⚠️  Digite apenas uma letra.");
            }
        } while (true);

        do {
            System.out.print("Digite a haste de DESTINO (ex: C): ");
            String input = scanner.nextLine().trim().toUpperCase();
            if (input.length() == 1) {
                destino = input.charAt(0);
                if (destino != origem) {
                    break;
                } else {
                    System.out.println("⚠️  A haste de destino deve ser diferente da origem.");
                }
            } else {
                System.out.println("⚠️  Digite apenas uma letra.");
            }
        } while (true);

        do {
            System.out.print("Digite a haste AUXILIAR (ex: B): ");
            String input = scanner.nextLine().trim().toUpperCase();
            if (input.length() == 1) {
                auxiliar = input.charAt(0);
                if (auxiliar != origem && auxiliar != destino) {
                    break;
                } else {
                    System.out.println("⚠️  A haste auxiliar deve ser diferente da origem e destino.");
                }
            } else {
                System.out.println("⚠️  Digite apenas uma letra.");
            }
        } while (true);

        System.out.println("\n" + "=".repeat(50));
        System.out.println("CONFIGURAÇÃO DO PROBLEMA:");
        System.out.println("Número de discos: " + n);
        System.out.println("Origem: " + origem + " → Destino: " + destino + " (usando " + auxiliar + " como auxiliar)");
        System.out.println("Movimentos necessários (2^" + n + " - 1): " + TorreHanoi.calcularMovimentos(n));
        System.out.println("=".repeat(50));

        System.out.print("\nDeseja ver todos os movimentos? (S/N): ");
        String confirmacao = scanner.nextLine().trim().toUpperCase();

        if (confirmacao.equals("S") || confirmacao.equals("SIM")) {
            System.out.println();

            TorreHanoi.resolverHanoi(n, origem, destino, auxiliar);

        } else {
            System.out.println("\n📋 Resumo: " + TorreHanoi.calcularMovimentos(n) + " movimentos seriam necessários.");
        }
        scanner.close();
    }
}