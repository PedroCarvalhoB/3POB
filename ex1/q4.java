package ex1;

import java.util.Scanner;

public class q4 {
    
    public static void main (String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.println("Digite 3 notas: ");

        System.out.print("Nota1: ");
        float no1 = input.nextFloat();
        
        System.out.print("Nota2: ");
        float no2 = input.nextFloat();

        System.out.print("Nota3: ");
        float no3 = input.nextFloat();

        System.out.println("Média aritimédica das notas = " + ((no1+no2+no3)/3) );

        input.close();
    }

}
