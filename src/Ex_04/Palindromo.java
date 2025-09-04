package Ex_04;

public class Palindromo {

    public boolean ehPalindromo(String texto) {
        String textoLimpo = texto.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        int inicio = 0;
        int fim = textoLimpo.length() - 1;

        while (inicio < fim) {
            if (textoLimpo.charAt(inicio) != textoLimpo.charAt(fim)) {
                return false;
            }
            inicio++;
            fim--;
        }

        return true;
    }
}