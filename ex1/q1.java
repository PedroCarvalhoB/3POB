package ex1;

import java.util.Scanner;

public class q1 {
    
    public static void main (String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.println("Digite dois números para somalos");
        
        System.out.print("n1: ");
        int n1 = input.nextInt();
        
        System.out.print("n2: ");
        int n2 = input.nextInt();

        System.out.println("Soma = " + (n1+n2) );

        input.close();
    }
}
