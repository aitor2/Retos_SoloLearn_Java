package Facil.Gratis;

import java.util.Scanner;

public class Hovercraft {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        final int cost = 21000000;
        final int price = 3000000;

        int sales = input.nextInt();

        if(sales*price > cost){
            System.out.println("Profit");
        }else if(sales*price == cost){
            System.out.print("Broke Even");
        }else{
            System.out.print("Loss");
        }
    }

}
