
// Laboratorio Nro 18 - Ejercicio 2
// Autor: Fiorela Clariza Quispe Quispe
// Colaboró: 2x2+0x+-32=0
// Tiempo: 45 min   
// Programa iterativo. Se ingresa en una ventana una cadena con formato #x2+#x+#=0 (sin espacios          | 0 1 2 3 4 5 6 7 8 9 10  11  12
// y cada coeficiente es un número real positivo o negativo). Mostrar las raíces reales de dicha ecuación | - 1 x 2 + - 2 x + - 3   =   0
// cuadrática usando modo de interacción gráfica. No usar subString, pero usar charAt(). |-1x2+-2x+-3=0   | -1.3265x2+-2.3265x+-3.3265=0
import javax.swing.*;

public class Ejercicio2 {
    public static void main(String[] args) {
        String cadenaEcuacion, cadenaCaracteres, strCoeficiente1 = "", strCoeficiente2 = "", strCoeficiente3 = "";
        char caracter;
        double a, b, c, discriminante, raiz1, raiz2;
        int i, j, cantidadTerminos;

        do {
            caracter = ' ';
            cadenaCaracteres = "";
            cantidadTerminos = 1;
            // Pide la ecuacion
            cadenaEcuacion = JOptionPane.showInputDialog(null,
                    "Ingrese una cadena con formato #x2+#x+#=0 (# es el coeficiente que debe digitar): ");
            // Bucle para hallar el valor de los coeficientes ingresados en la
            // cadenaEcuacion
            for (i = 0; caracter != '='; i++) {
                caracter = cadenaEcuacion.charAt(i);
                if (caracter == 'x') {
                    for (j = i;; j++, i++) { // Quita las variables
                        cadenaCaracteres = ""; // Limpia el termino anterior al leer uno nuevo
                        caracter = cadenaEcuacion.charAt(j);
                        if (caracter == '+') { // Sale del bucle cuando encuentre el signo +
                            break;
                        }
                        continue;
                    }
                }
                if (caracter != '+' && caracter != '=') {
                    // Agrega la cantidad de carateres que pertencecen a los terminos de la ecuacion
                    cadenaCaracteres += (caracter);
                } else {
                    cantidadTerminos++;
                }
                // Almacenando el valor de los coeficientes donde corresponden
                switch (cantidadTerminos) {
                    case 1:
                        strCoeficiente1 = cadenaCaracteres;
                        break;
                    case 2:
                        strCoeficiente2 = cadenaCaracteres;
                        break;
                    case 3:
                        strCoeficiente3 = cadenaCaracteres;
                        break;
                }
            }
            // Reasignando valores de los coeficientes 1, 2 , 3 en a, b, c
            a = Double.parseDouble(strCoeficiente1);
            b = Double.parseDouble(strCoeficiente2);
            c = Double.parseDouble(strCoeficiente3);
            // Operaciones para calcular la discriminante y las raices de la ecuación
            // cuadrática
            discriminante = Math.pow(b, 2) - (4 * a * c);
            raiz1 = (double) Math.round((((-1) * b + Math.sqrt(discriminante)) / (2 * a)) * 100) / 100;
            raiz2 = (double) Math.round((((-1) * b - Math.sqrt(discriminante)) / (2 * a)) * 100) / 100;
            // Condicionales para clasificar los valores de las raices y la salida
            // correspondiente
            if (discriminante > 0) {
                JOptionPane.showMessageDialog(null, "El valor de las raices son:\n* " + raiz1 + "\n* " + raiz2);
            } else {
                if (discriminante == 0) {
                    JOptionPane.showMessageDialog(null, "Solo existe una raíz y su valor es: " + raiz1);
                } else {
                    JOptionPane.showMessageDialog(null, "La ecuación no tiene raices reales.");
                }
            }
        } while (JOptionPane.showConfirmDialog(null, "¿Desea intentar con otra ecuación?",
                "Generar nueva ecuación...", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION);
    }
}
