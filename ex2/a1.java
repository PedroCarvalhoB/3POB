/*
Exercício 1: Verificação de Número Par ou Ímpar

Descrição:
    Crie um programa que solicite um número inteiro ao usuário e determine se ele é
    par ou ímpar, utilizando a estrutura if-else.

Requisitos:
    • O programa deve ler um número inteiro.
    • Se o número for divisível por 2, exibir "O número é par."
    • Caso contrário, exibir "O número é ímpar.".
*/

import java.util.Scanner;

public class a1 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        if (n%2 == 0) {
            System.out.println("O número é par.");
        } else {
            System.out.println("O número é impar.");
        }

        scan.close();
    }
}