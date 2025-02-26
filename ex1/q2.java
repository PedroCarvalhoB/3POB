package ex1;

import java.util.Scanner;

public class q2 {
    
    public static void main (String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o raio de um cículo:");
        Double raio = input.nextDouble();
        final double pi = 3.14159;

        System.out.println("Área do circulo = " + (Math.pow(raio, 2) * pi) );

        input.close();
    }

}
