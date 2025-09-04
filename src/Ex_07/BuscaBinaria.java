package Ex_07;


public class BuscaBinaria {

    public int buscaBinaria(int[] v, int x) {
        if (v == null || v.length == 0) {
            return -1;
        }
        return buscaBinariaRecursiva(v, x, 0, v.length - 1);
    }

    private int buscaBinariaRecursiva(int[] v, int x, int inicio, int fim) {
        if (inicio > fim) {
            return -1;
        }

        int meio = inicio + (fim - inicio) / 2;

        if (v[meio] == x) {
            return meio;
        }

        if (x < v[meio]) {
            return buscaBinariaRecursiva(v, x, inicio, meio - 1);
        }
        else {
            return buscaBinariaRecursiva(v, x, meio + 1, fim);
        }
    }
}
