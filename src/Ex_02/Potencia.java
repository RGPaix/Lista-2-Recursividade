package Ex_02;

public class Potencia {

    public double potencia(double a, int b){
        if (b == 0){
            return 1;
        }

        if (b < 0){
            return 1 / potencia(a, -b);
        }
        return a * potencia(a, b - 1);
    }
}