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
public class Resta {

    public static void main(String args[]) {

        int aleatorio1 = 0, aleatorio2 = 0, aleatorio3, aleatorio4, resultado = 0, r = 0, puntaje = 0;
        Scanner entrada = new Scanner(System.in);
        int[] numeros = new int[4];

        for (int i = 0; i <= 9; i++) {
            aleatorio1 = (int) (Math.random() * 10);
            aleatorio2 = (int) (Math.random() * 10);
            System.out.println("Seleccione la respuesta correcta  de la siguiente resta :");
            System.out.println("");
            System.out.println("----> " + aleatorio1 + "-" + aleatorio2 + " <----");
            resultado = aleatorio1 - aleatorio2;

            numeros[0] = (int) (Math.random() * 10);
            numeros[1] = (int) (Math.random() * 10);
            numeros[2] = (int) (Math.random() * 10);
            numeros[3] = (int) (Math.random() * 10);
            numeros[(int) (Math.random() * 3)] = resultado;

            System.out.println("");
            System.out.println("Opcion 1 :" + " " + numeros[0] + "     " + "Opcion 2 :" + " " + numeros[1] + "\n"
                             + "Opcion 3 :" + " " + numeros[2] + "     " + "Opcion 4 :" + " " + numeros[3]);

            System.out.println("");

            System.out.println("Digite la respuesta correcta :");

            System.out.println("");

            r = entrada.nextInt();

            if (r == resultado) {

                System.out.println("Respuesta Correcta");
                puntaje += 10;
                System.out.println("Su puntaje actual es :" + puntaje);
            } else {
                System.out.println("Respuesta Incorrecta");
            }
        }
    }
}
