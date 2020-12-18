package operacionesArtmeticascMetodos;

import javax.swing.JOptionPane;

public class operacionesArtmeticascMetodos {

    public static void main(String[] args) {
        int a, b;
        a = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el numero a"));
        b = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el numero b"));

        JOptionPane.showMessageDialog(null, "la ressiduo es " + residuo(a, b));
        JOptionPane.showMessageDialog(null, "la multiplicacion es " + multiplicacion(a, b));
        JOptionPane.showMessageDialog(null, "la potencia es " + potencia(a, b));
         JOptionPane.showMessageDialog(null, "la resta es " + resta(a, b));

    }
//puede ser la forma mas simple tambien
    public static int residuo(int x, int y) {
        int resultado = x;
        int n = x / y;
        for (int i = 0; i < n; i++) {
            resultado = resultado - y;
        }
        return resultado;

    }

    public static int multiplicacion(int x, int y) {
        int resultado = 0;
        for (int i = 0; i < y; i++) {
            resultado = resultado + x;
        }
        return resultado;

    }

    public static double potencia(int x, int y) {
        double resultado;
        resultado = Math.pow(x,y);
        return resultado;

    }
    
     public static double resta(int x, int y) {
        double resultado;
        resultado = x-y;
        return resultado;

    }
    

}
