package Facil.Gratis;

import java.util.Scanner;

public class PaintCosts {

    public static void main(String[] args) {
        int pinturas;
        Scanner input = new Scanner(System.in);
        pinturas = input.nextInt();
        double calculo1 = 40+(pinturas*5);
        double tasa = calculo1/10;
        calculo1+=tasa;
        calculo1 = Math.ceil(calculo1);
        System.out.printf("%.0f",calculo1);
    }

}
