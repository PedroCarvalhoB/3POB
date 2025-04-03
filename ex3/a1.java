import java.util.Scanner;

public class a1 {
  
  public static void main(String[] args) {

    Scanner entrada = new Scanner(System.in);
    System.out.println("Entre com um número N: ");  //pedindo o número ao usuário
    int num = entrada.nextInt();

    int soma=0;
    for(int i=1; i<=num; i++) {  //realizando o loop

      soma += i;
    }

    System.out.println("O resultado da soma é: " + soma);  //exibindo o resultado

    entrada.close();
  }
}