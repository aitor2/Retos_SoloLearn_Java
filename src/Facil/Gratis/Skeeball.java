package Facil.Gratis;

import java.util.Scanner;

public class Skeeball {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int puntuacion = teclado.nextInt();
        int coste = teclado.nextInt();

        if(puntuacion/12 >= coste){
            System.out.println("Buy it!");
        }else{
            System.out.println("Try again");
        }

    }

}
