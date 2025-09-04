package Ex_06;

public class Contador {

    public int contaOcorrencias(int[] v, int x) {
        int contador = 0;

        for (int elemento : v) {
            if (elemento == x) {
                contador++;
            }
        }

        return contador;
    }
}