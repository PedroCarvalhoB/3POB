import java.util.Scanner;

public class a5 {
 
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int vetor[] = new int[10];

    for(int i=0; i<10; i++) {

      System.out.println("Entre com um número inteiro: ");
      vetor[i] = sc.nextInt();
    }

    System.out.println("Qual número deseja buscar: ");
    int num = sc.nextInt();

    for(int i=0; i<10; i++) {

      if(vetor[i]==num) {

        System.out.println("Número encontrado com sucesso!");
        System.exit(1);
      }
    }

    System.out.println("Número não encontrado!");

    sc.close();
  }
}