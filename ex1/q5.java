package ex1;

import java.util.Scanner;

public class q5 {
    
    public static void main (String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.print("Digite sua idade em anos: ");
        int anos = input.nextInt();

        System.out.println("Quantidade aproximada de dias que você viveu = " + (anos*365) );

        input.close();
    }

}
