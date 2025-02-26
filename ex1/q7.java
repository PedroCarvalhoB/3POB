package ex1;

import java.util.Scanner;

public class q7 {
    
    public static void main (String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.print("Digite a base do retangulo: ");
        float ba = input.nextFloat();

        System.out.print("Digite a altura: ");
        float al = input.nextFloat();

        System.out.println("Perimetro do retangulo = " + (2*(ba+al)) );
        System.out.println("Área do retangulo = " + (ba*al) );

        input.close();
    }
}
