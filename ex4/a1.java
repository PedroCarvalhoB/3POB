import java.util.Scanner;

public class a1 {

  public static void main(String[] args) {

    Scanner entrada = new Scanner(System.in);
    int vetor[] = new int[5];  //declarando vetor
    int maior = Integer.MIN_VALUE, menor = Integer.MAX_VALUE;  //máximo e mínimo valores inteiros

    for(int i=0; i<5; i++) {

      System.out.println("Entre com um valor inteiro: ");
      vetor[i] = entrada.nextInt();
    }

    for(int i=0; i<5; i++) {

      if(vetor[i]>maior) {

        maior = vetor[i];
      }
    
      if(vetor[i]<menor) {

        menor = vetor[i];
      }
    }

    System.out.println("Maior valor: " + maior);
    System.out.println("Menor valor: " + menor);

    entrada.close();
  }
}