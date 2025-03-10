
/*
    Exercício 3: Calculadora Simples com switch-case
Descrição:
    Crie um programa que simule uma calculadora simples, permitindo ao usuário
    escolher uma operação matemática básica (+, -, *, /) e dois números.
Requisitos:
    • O programa deve solicitar dois números e a operação desejada.
    • Deve usar switch-case para executar a operação correspondente.
    • Caso a operação não seja válida, exibir "Operação inválida.".
    • Se a operação for divisão (/), verificar se o segundo número é zero antes de
    calcular.
*/

import java.util.Scanner;

public class a3 {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Num 1: ");
        int n1 = scan.nextInt();
        System.out.println("Num 2: ");
        int n2 = scan.nextInt();
        System.out.println("1 = soma\n2 = subtração\n3 = multiplicação\n4 = divisão\n");
        int ope = scan.nextInt();

        float res;

        switch (ope) {
            case 1:
                res = n1 + n2;
                break;
            
            case 2:
                res = n1 - n2;
                break;

            case 3:
                res = n1 * n2;
                break;

            case 4:
                if (n2 == 0) {
                    System.out.println("Denominador não pode ser 0");
                    scan.close();
                    return;
                }
                res = (float)n1 / n2;
                break;

            default:
                System.out.println("Operação nã válida");
                scan.close();
                return;
        }

        System.out.println("Resultado = "+ res);

        scan.close();
    }

}
