package Facil.Gratis;

import java.util.Scanner;

public class GhotamCity {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int n;

        n = entrada.nextInt();

        if (n<=4){
            System.out.print("I got this!");
        }
        else if (n>4 && n<11){
            System.out.print("Help me Batman");
        }
        else{
            System.out.print("Good Luck out there!");
        }
    }

}
