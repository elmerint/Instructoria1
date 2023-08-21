package ejerciciouno;

import javax.swing.JOptionPane;

public class EjercicioUno {

    public static void main(String[] args) {
        double nota1, nota2, nota3, nota4, ponderacion1, ponderacion2, ponderacion3, ponderacion4, promedio, total = 100;
        //Asignacion de las ponderaciones
        //Asignacion de la ponderacion 1
        do {
            ponderacion1 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la ponderacion de la nota1 mayor a 10 y menor o igual a 60"));
            if (ponderacion1 < 10 || ponderacion1 > 60) {
                JOptionPane.showMessageDialog(null, "La ponderacion registrada no es la correcta, por favor ingrese una correcta");
            } 
        } while (ponderacion1 < 10 || ponderacion1 > 60);
        total -= ponderacion1;
        
        //Asignacion de la ponderacion 2
        if (total <= 80) {
            do {
                ponderacion2 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la ponderacion de la nota2 mayor a 10 y menor o igual a " + (total - 20)));
                if (ponderacion2 < 10 || ponderacion2 > (total - 20)) {
                    JOptionPane.showMessageDialog(null, "La ponderacion registrada no es la correcta, por favor ingrese una correcta");
                } 
            } while (ponderacion2 < 10 || ponderacion2 > 60);
            total -= ponderacion2;
        } else {
            do {
                ponderacion2 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la ponderacion de la nota2 mayor a 10 y menor o igual a 60"));
                if (ponderacion2 < 10 || ponderacion2 > 60) {
                    JOptionPane.showMessageDialog(null, "La ponderacion registrada no es la correcta, por favor ingrese una correcta");
                } 
            } while (ponderacion2 < 10 || ponderacion2 > 60);
             total -= ponderacion2;

        }

        //Asignacion de la ponderacion 3
        if (total == 20) {
            ponderacion3 = 10;
            ponderacion4 = 10;
            total -= 20;
        } else {
            if (total > 70) {
                do {
                    ponderacion3 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la ponderacion de la nota3 mayor a " + (total - 60) + " y menor o igual a 60"));
                    if (ponderacion3 < (total - 60) || ponderacion3 > 60) {
                        JOptionPane.showMessageDialog(null, "La ponderacion registrada no es la correcta, por favor ingrese una correcta");
                    } 
                } while (ponderacion3 < (total - 60) || ponderacion3 > 60);
                total -= ponderacion3;
            } else {
                do {
                    ponderacion3 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la ponderacion de la nota 3 mayor a 10 y menor a " + (total - 10)));
                    if (ponderacion3 < 10 || ponderacion3 > (total - 10)) {
                        JOptionPane.showMessageDialog(null, "La ponderacion registrada no es la correcta, por favor ingrese una correcta");
                    } 
                } while (ponderacion3 < 10 || ponderacion3 > (total - 10));
                total -= ponderacion3;
            }
            ponderacion4 = total;
        }

        do {
            nota1 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la nota 1 del estudiante: "+ponderacion1+"%"));
        } while (nota1 < 0 || nota1 > 10);
        do {
            nota2 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la nota 2 del estudiante: "+ponderacion2+"%"));
        } while (nota2 < 0 || nota2 > 10);
        do {
            nota3 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la nota 3 del estudiante: "+ponderacion3+"%"));
        } while (nota3 < 0 || nota3 > 10);
        do {
            nota4 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la nota 4 del estudiante: "+ponderacion4+"%"));
        } while (nota4 < 0 || nota4 > 10);

        promedio = (nota1 * (ponderacion1 / 100)) + (nota2 * (ponderacion2 / 100)) + (nota3 * (ponderacion3 / 100)) + (nota4 * (ponderacion4 / 100));
        JOptionPane.showMessageDialog(null, String.format("El promedio del estudiante es de %.2f", promedio));
    }

}
