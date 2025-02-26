package ex1;

import java.util.Scanner;

public class q6 {
    
    public static void main (String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o salário bruto: ");
        float sala = input.nextFloat();

        System.out.print("Digite o desconto do INSS: ");
        float inss = input.nextFloat();

        System.out.println("Salário líquido = " + (sala-inss) );

        input.close();
    }
}
