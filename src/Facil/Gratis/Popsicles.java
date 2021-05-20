package Facil.Gratis;

import java.util.Scanner;

public class Popsicles {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        final int hermanos = input.nextInt();
        final int paletasHielo = input.nextInt();

        if(paletasHielo%hermanos == 0) {
            System.out.println("give away");
        }
        else {
            System.out.println("eat them yourself");
        }


    }

}
