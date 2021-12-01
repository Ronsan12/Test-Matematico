/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test_Matematico;

import java.util.Scanner;

/**
 *
 * @author yohan
 */
public class Division {

    public static void main(String args[]) {

        int resultado = 0, aleatorio1 = 0, aleatorio2 = 0, aleatorio3, aleatorio4, puntaje = 0, r = 0;
        Scanner entrada = new Scanner(System.in);
        int[] numeros = new int[4];

        for (int i = 0; i <= 9; i++) {
            aleatorio1 = (int) (Math.random() * 9) + 1;
            aleatorio2 = (int) (Math.random() * 9) + 1;
           
            System.out.println("Seleccione la respuesta correcta  de la siguiente division :");
            System.out.println("");
            System.out.println("----> " + (aleatorio1 * aleatorio2) + "/" + aleatorio1 + " <----");
            resultado =  aleatorio2;

            numeros[0] = (int) (Math.random() * 9) + 1;
            numeros[1] = (int) (Math.random() * 9) + 1;
            numeros[2] = (int) (Math.random() * 9) + 1;
            numeros[3] = (int) (Math.random() * 9) + 1;
            numeros[(int) (Math.random() * 3)] = resultado;

            System.out.println("");
            System.out.println("Opcion 1 :" + " " + numeros[0] + "     " + "Opcion 2 :" + " " + numeros[1] + "\n"
                             + "Opcion 3 :" + " " + numeros[2] + "     " + "Opcion 4 :" + " " + numeros[3]);

            System.out.println("");

            System.out.println("Digite la respuesta correcta :");

            System.out.println("");

            r = entrada.nextInt();

            if (numeros[r-1] == resultado) {
                puntaje += 10;
                System.out.println("Su puntaje actual es :" + puntaje);
                System.out.println("Respuesta Correcta");
            } else {
                System.out.println("Respuesta Incorrecta");
            }
        }
    }
}
