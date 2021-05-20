package Facil.Gratis;

import java.util.Scanner;

public class CheerCreator {

    public static void main(String[] args) {
        int yardas;
        Scanner input = new Scanner(System.in);
        yardas = input.nextInt();
        if(yardas < 1){
            System.out.print("shh");
        }else if(yardas > 10){
            System.out.print("High Five");
        }else{
            for(int i = 0; i < yardas;i++){
                System.out.print("Ra!");
            }
        }
    }

}
