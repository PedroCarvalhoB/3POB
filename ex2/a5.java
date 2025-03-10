/* 
    Exercício 5: Conversão de Notas para Conceito
Descrição:
    Escreva um programa que leia uma nota de 0 a 10 e exiba o conceito
    correspondente, utilizando switch-case.
Tabela de Conceitos:
    • 9 a 10 → A
    • 7 a 8 → B
    • 5 a 6 → C
    • 3 a 4 → D
    • 0 a 2 → E
Requisitos:
    • Se a nota estiver fora do intervalo 0 a 10, exibir "Nota inválida.".
*/

import java.util.Scanner;

public class a5 {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite uma nota: ");
        float temp = scan.nextFloat();

        int nota = (int)Math.ceil(temp);

        switch (nota) {
            case 10:
            case 9:
                System.out.println("A");
                break;
            
            case 8:
            case 7:
                System.out.println("B");
                break;
            
            case 6:
            case 5:
                System.out.println("C");
                break;

            case 4:
            case 3:
                System.out.println("E");
                break;

            case 2:
            case 1:
            case 0:
                System.out.println("F");
                break;
        
            default:
                System.out.println("Nota inválida.");
                break;
        }

        scan.close();
    }

}
