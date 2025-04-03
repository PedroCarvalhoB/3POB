import java.util.Scanner;

public class a4 {
  
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int vetor[] = new int[8], cont=0;

    for (int i=0; i<8; i++) {

      System.out.println("Entre com um número inteiro: ");
      vetor[i] = sc.nextInt();

      if(vetor[i]%2==0) 
      cont++; 
    }

    for(int i=0; i<8; i++) {

      if(vetor[i]%2==0) 
      System.out.print(vetor[i] + ", ");
    }

    System.out.println("A quantidade de números pares é: " + cont);

    sc.close();
  }
}