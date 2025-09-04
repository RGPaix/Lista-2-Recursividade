package Ex_03;

public class Vetor {

    public int soma(int[] v) {
        if (v == null || v.length == 0) {
            return 0;
        }

        int total = 0;

        for (int elemento : v) {
            total += elemento;
        }

        return total;
    }
}