package Ex_08;

public class TorreHanoi {

    private static int numeroMovimento = 1;

    public static void hanoi(int n, char origem, char destino, char auxiliar) {
        if (n == 1) {
            System.out.println("Movimento " + numeroMovimento + ": Mover disco 1 de " + origem + " para " + destino);
            numeroMovimento++;
            return;
        }

        hanoi(n - 1, origem, auxiliar, destino);

        System.out.println("Movimento " + numeroMovimento + ": Mover disco " + n + " de " + origem + " para " + destino);
        numeroMovimento++;

        hanoi(n - 1, auxiliar, destino, origem);
    }

    public static int calcularMovimentos(int n) {
        return (int) Math.pow(2, n) - 1;
    }

    public static void resolverHanoi(int n, char origem, char destino, char auxiliar) {
        numeroMovimento = 1; // Reset do contador

        System.out.println("=== TORRE DE HANOI ===");
        System.out.println("Número de discos: " + n);
        System.out.println("Origem: " + origem + " | Destino: " + destino + " | Auxiliar: " + auxiliar);
        System.out.println("Número total de movimentos esperados: " + calcularMovimentos(n));
        System.out.println("\nSequência de movimentos:");
        System.out.println("-".repeat(50));

        hanoi(n, origem, destino, auxiliar);

        System.out.println("-".repeat(50));
        System.out.println("Total de movimentos realizados: " + (numeroMovimento - 1));
    }
}