package Ex_05;

public class Inversor {
    public String inverte (String s) {
        if (s == null || s.isEmpty()) {
            return s;
        }

        char[] caracteres = s.toCharArray();
        char[] invertido = new char[caracteres.length];

        int j = 0;
        for (int i = caracteres.length - 1; i >= 0; i--) {
            invertido[j] = caracteres[i];
            j++;
        }

        return new String(invertido);
    }
}
