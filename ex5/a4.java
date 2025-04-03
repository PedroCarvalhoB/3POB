import java.util.ArrayList;
import java.util.Scanner;

public class a4 {
  
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    ArrayList<Integer> numeros = new ArrayList<>();
    
    for(int i=0; i<10; i++) {

      System.out.println("Entre com um número inteiro: ");
      int num = sc.nextInt();
      numeros.add(num);
    }

    System.out.println("Exibindo todos os números digitados:");
    for(int i=0; i<numeros.size(); i++) {

      System.out.println(numeros.get(i));
    }

    System.out.println("Qual número você quer saber a quantidade de ocorrências: ");
    int numProcurado = sc.nextInt();
    int ocorrencias = 0;

    for(int i=0; i<numeros.size(); i++) {

      if(numeros.get(i) == numProcurado) 
        ocorrencias++;
    }

    System.out.println("A quantidade de ocorrências do número  " + numProcurado + "é: " + ocorrencias);

    sc.close();
  }
}