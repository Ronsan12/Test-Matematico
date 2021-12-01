/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test_Matematico;

import java.util.Random;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author yohan
 */
public class numeroaleatorio {

    public static void main(String[] args) {

        int resultado2 = 0, aleatorio1 = 0, aleatorio2 = 0, aleatorio3 = 0, aleatorio4 = 0, aleatorio5 = 0, resultado1;
        Scanner entrada = new Scanner(System.in);
        int [] numeros = new int [3];
        
        for (int i = 0; i < 10; i++) {
            
            aleatorio1 = (int) (Math.random() * 10);
            aleatorio2 = (int) (Math.random() * 10);
            aleatorio3 = (int) (Math.random() * 10);
            aleatorio4 = (int) (Math.random() * 10);

            //Inicio pregunta numero 1
            System.out.println("Pregunta N° " + (i + 1));
            System.out.println("Seleccione la respuesta correcta de esta suma");
            System.out.print(aleatorio1);
            System.out.print(" + ");
            System.out.println(aleatorio2);
            resultado1 = (aleatorio1 + aleatorio2);

            System.out.print("Opcion 1 :" + aleatorio3);
            System.out.print("          ");
            System.out.println("Opcion 2 :" + aleatorio4);
            System.out.print("Opcion 3 :" + aleatorio5);
            System.out.print("          ");
            System.out.println("Opcion 4 :" + resultado1);
            System.out.println("Digite el numero de la respuesta correcta : ");
            resultado1 = entrada.nextInt();

            if (resultado1 == 4) {

                System.out.println("Respuesta Correcta");
            } else {
                System.out.println("Respuesta Incorrecta");
            }

        }

    }
}
