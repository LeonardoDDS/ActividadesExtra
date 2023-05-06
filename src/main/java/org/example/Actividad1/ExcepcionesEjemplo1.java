package org.example.Actividad1;

import java.util.Scanner;

public class ExcepcionesEjemplo1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        /*int a = 10;
        //int b = 0;
        //int b = teclado.nextInt();
        int b= Integer.parseInt(teclado.nextLine());*/
        try {
            int a = 10;
            int b = Integer.parseInt(teclado.nextLine());
            System.out.println("División: " + (a / b));
        }catch (ArithmeticException e){
            //e.printStackTrace();
            System.out.println("No se puede dividir ente 0");
        }catch (NumberFormatException nfe){
            System.out.println("No capturaste el dato de manera correcta");
        } finally {
            System.out.println("Siempre se ejecuta...");
        }
        System.out.println("Fin del programa!!");
    }
}
