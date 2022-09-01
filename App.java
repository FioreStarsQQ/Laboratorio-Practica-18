import java.util.*;
public class App {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String texto;
        int aleatorioM;
        
        aleatorioM = (int) (Math.random() * (21)) - 10;
        System.out.print(aleatorioM);
        System.out.print("Ingrese el texto: ");
        texto = scan.next();
        String invertida = new StringBuilder(texto).reverse().toString();
        
        if (texto.equals(invertida)) {
            System.out.print("Si es palindromo.");
        } else {
            System.out.print("No es palindromo.");
        }

        // for (i = 0; cadenas != '='; i++) {
        //     if (cadenas == 'x') {
        //         JOptionPane.showMessageDialog(null, "Este es: " + i);
        //         for (j = i; cadenas != '+'; j++, i++) {
        //             cadenas = cadenaEcuacion.charAt(j);
        //             continue;
        //         }
        //     }
        //     cadenas = cadenaEcuacion.charAt(i);
        //     JOptionPane.showMessageDialog(null, cadenas);

        // }


        // while (caracter != '=') {

        //     caracter = cadenaEcuacion.charAt(i);
        //     if (caracter == 'x') {
        //         pasada++;
        //         quitar = --i;
        //         JOptionPane.showMessageDialog(null, "Este es: " + quitar + " Pasada N° " + pasada);
        //         cadena = "";
        //         for (j = i;; j++, i++) {
        //             caracter = cadenaEcuacion.charAt(j);
        //             if (caracter == '+') {
        //                 break;
        //             }
        //             continue;

        //         }
        //         JOptionPane.showMessageDialog(null, "medir i: " + i);
        //     }
        //     JOptionPane.showMessageDialog(null, "medir i2: " + i);
        //     if (caracter != '+' && caracter != '=') {
        //         cadena += (caracter);//
        //         JOptionPane.showMessageDialog(null, cadena);

        //     }
        //     // coeficiente1 = Double.parseDouble(cadena);
        //     // JOptionPane.showMessageDialog(null, coeficiente1);

        //     // if (pasada == 1){
        //     // caracter = cadenaEcuacion.charAt(i);
        //     // cadena += Character.toString(caracter);
        //     // JOptionPane.showMessageDialog(null, cadena);
        //     // coeficiente1 = Double.parseDouble(cadena);
        //     // } else if (pasada==2){
        //     // caracter = cadenaEcuacion.charAt(i);
        //     // cadena += Character.toString(caracter);
        //     // JOptionPane.showMessageDialog(null, cadena);
        //     // coeficiente1 = Double.parseDouble(cadena);
        //     // } else {
        //     // caracter = cadenaEcuacion.charAt(i);
        //     // cadena += Character.toString(caracter);
        //     // JOptionPane.showMessageDialog(null, cadena);
        //     // coeficiente1 = Double.parseDouble(cadena);
        //     // }

        //     // caracter = cadenaEcuacion.charAt(i);
        //     // cadena += Character.toString(caracter);
        //     i++;
        // }



        scan.close();
    }
}