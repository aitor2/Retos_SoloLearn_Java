package Facil.Gratis;

import java.util.Scanner;

public class Argentina {

    public static void main(String[] args) {
        int pesos;
        int dollars;
        Scanner input = new Scanner(System.in);
        pesos = input.nextInt();
        dollars = input.nextInt();
        if(pesos * 0.02 < dollars){
            System.out.print("Pesos");
        }else{
            System.out.print("Dollars");
        }
    }

}
