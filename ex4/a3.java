import java.util.Scanner;

public class a3 {
   public static void main(String[] args) {

    Scanner entrada = new Scanner(System.in);
    int vetor[] = new int[6];

    for(int i=0; i<6; i++) {

      System.out.println("Entre com um número inteiro: ");
      vetor[i] = entrada.nextInt();
    }

    for(int i=vetor.length-1; i>=0; i--) {

      System.out.print(vetor[i]);
    }

    entrada.close();
  }
}