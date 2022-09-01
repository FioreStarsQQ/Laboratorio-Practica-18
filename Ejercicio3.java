
// Laboratorio Nro 18 - Ejercicio 3
// Autor: Fiorela Clariza Quispe Quispe
// Colaboró: 
// Tiempo: 30 min
// Programa iterativo que muestre todos los números primos de un rango [inf, sup] que se ingrese. 
// Ud. debe hacer que se cumpla inf<=sup y que inf y sup sean números naturales.

import javax.swing.JOptionPane;

public class Ejercicio3 {
    public static void main(String[] args) {
        int limiteInferior = 0, limiteSuperior = 0, sumaFactores;
        do {
            // Explicacion del programa
            JOptionPane.showMessageDialog(null,
                    "* NUMEROS PRIMOS *\nCon este programa se podra hallar los numeros primos de un rango determinado por usted."
                            + "\n*Los limites ingresados deben de cumplir con que el primero sea menor al segundo.",
                    "BIENVENIDO(A)", JOptionPane.INFORMATION_MESSAGE);
            // Pide los limites inferior y superior, asimismo valida si el primer numero es
            // natural y que el siguiente numero tambien lo sea y sea mayor que el primero
            do {
                limiteInferior = Integer.parseInt(JOptionPane.showInputDialog(null,
                        "Antes de iniciar ten en cuenta ingresar números naturales.\n"
                                + "Ingrese el valor del límite inferior (inf): ",
                        "LIMITE INFERIOR", JOptionPane.QUESTION_MESSAGE));
            } while (limiteInferior <= 0);
            do {
                limiteSuperior = Integer.parseInt(JOptionPane.showInputDialog(null,
                        "*Recuerda ingresar números naturales, asimismo este debe ser mayor que el anterior.\n"
                                + "Ingrese el valor del límite superior (sup): ",
                        "LIMITE SUPERIOR", JOptionPane.QUESTION_MESSAGE));
            } while (limiteInferior > limiteSuperior);
            // Bucle para hallar el numero primo dentro del rango establecido
            for (int i = limiteInferior; i <= limiteSuperior; i++) {
                sumaFactores = 0;
                for (int j = 1; j <= i; j++) {
                    if (i % j == 0) {
                        sumaFactores++;
                    }
                }
                // Selecciona el numero primo y lo imprime
                if (sumaFactores == 2) {
                    JOptionPane.showMessageDialog(null,
                            "Un número primo dentro del rango [" + limiteInferior + ", " + limiteSuperior
                                    + "] es: " + i,
                            "Numeros primos en rango...", JOptionPane.INFORMATION_MESSAGE);
                }
            }
            // Pregunta si desea continuar en el programa y establecer otro rango
        } while (JOptionPane.showConfirmDialog(null, "¿Desea intentar con otro rango?",
                "Generar nuevo rango...", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION);
    }
}
