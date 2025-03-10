/* 
    Exercício 4: Verificação de Ano Bissexto

Descrição:
    Desenvolva um programa que leia um ano e verifique se ele é bissexto ou não,
    utilizando if-else.
Critérios para ser bissexto:
    • Deve ser divisível por 4.
    • Se for divisível por 100, deve também ser divisível por 400.
*/

import java.util.Scanner;

public class a4 {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um ano e saiba se ele é bissexto: ");
        int ano = scan.nextInt();

        if (ano % 4 != 0) {
            System.out.println("NÃO é bissexto");
        } else if (ano % 100 == 0 && ano % 400 != 0) {
            System.out.println("NÃO é bissexto");
        } else {
            System.out.println("É bissexto");
        }

        scan.close();
    }

}
