package ex1;

import java.util.Scanner;

public class q3 {
    
    public static void main (String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.print("Digite uma temperatura em Celsius: ");
        Double cel = input.nextDouble();

        System.out.println("Temperatura em Fahrenheit = " + (cel*(9.0/5)+32) );

        input.close();
    }

}
