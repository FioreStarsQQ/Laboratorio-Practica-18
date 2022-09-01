
// Laboratorio Nro 18 - Ejercicio 1
// Autor: Fiorela Clariza Quispe Quispe
// Colaboró: 
// Tiempo: 40 min
// El programa debe generar un rango aleatorio [m..n], para m, n enteros entre -10 y 10
// Verificar que m<0 y n >0. Sin control de repetición medio.
// Hacer un programa iterativo que permita generar números aleatorios en dicho rango, hasta que se le
// diga al programa que ya no se desea generar más.
// Al salir mostrar cuantos fueron positivos, cuantos negativos y sus respectivos porcentajes (no contar
// el 0).
// Modo gráfico y método random.
import javax.swing.*;

public class Ejercicio1 {
    public static void main(String[] args) {
        int aleatorioM, aleatorioN, numeroAleatorio, numerosNeg = 0, numerosPos = 0, continuar = 1;
        double porcentajeNeg, porcentajePos;
        // Genera un rango aleatorio entre -10 y 10
        do {
            aleatorioM = (int) (Math.random() * (21)) - 10;
            aleatorioN = (int) (Math.random() * (21)) - 10;
        } while ((aleatorioN <= 0) || (aleatorioM >= 0));
        // Bucle para seguir generando un número aleatorio en el rango establecido
        // aleatoriamente
        for (; continuar == 1;) {
            numeroAleatorio = (int) (Math.random() * (aleatorioN + (aleatorioM * -1) + 1)) + aleatorioM;
            if (numeroAleatorio != 0) {
                // Mientras el número sea diferente de cero se sumara aquellos que sean
                // positivos o negativos
                if (numeroAleatorio < 0) {
                    numerosNeg++;
                } else {
                    numerosPos++;
                }
            }
            // Muestra el rango aleatorio y el número aleatorio que se generó en él
            JOptionPane.showMessageDialog(null,
                    "Creando rangos aleatorios...\nValor de m: " + aleatorioM + "\nValor de n: " + aleatorioN
                            + "\nEl número aleatorio generado en ese rango fue: " + numeroAleatorio);
            // Pregunta si desea generar otro número aleatorio
            continuar = JOptionPane.showConfirmDialog(null, "¿Desea que se genere otro número aleatorio?",
                    "GENERAR NUEVO NÚMERO", JOptionPane.YES_NO_OPTION);
            if (continuar == JOptionPane.NO_OPTION) {
                continuar = 0;
            } else {
                continuar = 1;
            }
        }
        // Calculando el porcentaje y redondeándolos a dos decimales
        porcentajeNeg = (double) Math.round((numerosNeg * 100) / (numerosPos + numerosNeg) * 100) / 100;
        porcentajePos = (double) Math.round((numerosPos * 100) / (numerosPos + numerosNeg) * 100) / 100;
        JOptionPane.showMessageDialog(null,
                "Cantidad de numeros positivos generados: " + numerosPos + "\nRepresentando el : " + porcentajePos
                        + "% del total."
                        + "\nCantidad de numeros negativos generados: " + numerosNeg + "\nRepresentando el: "
                        + porcentajeNeg + "% del total.");
    }
}