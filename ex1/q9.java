package ex1;

import java.util.Scanner;

public class q9 {
    public static void main (String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o raio da esfera: ");
        double raio = input.nextDouble();
        final double pi = 3.14159;

        System.out.println("O volume da esfera é = " + (((4/3)*pi)*Math.pow(raio, 3)) );

        input.close();
    }
}
