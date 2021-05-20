package Facil.Gratis;

import java.util.Scanner;

public class JungleCamping {

    public static void main(String[] args) {
        String[] texto = new Scanner(System.in).nextLine().split(" ");

        for (String t : texto){
            if(t.equalsIgnoreCase("Rawr")){
                System.out.print("Tiger ");
            }else if(t.equalsIgnoreCase("Chirp")){
                System.out.print("Bird ");
            }else if(t.equalsIgnoreCase("Ssss")){
                System.out.print("Snake ");
            }else if(t.equalsIgnoreCase("Grr")){
                System.out.print("Lion ");
            }
        }
    }

}
