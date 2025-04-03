import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class a5 {
  
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    ArrayList<Integer> numeros = new ArrayList<>();

    while(true) {

      System.out.println("Entre com um número(digite -1 para sair): ");
      int num = sc.nextInt();

      if(num==-1)
        break;
      
      numeros.add(num);
    }

    System.out.println("Exibindo os números pela ordem de inserção: " + numeros);

    Collections.sort(numeros);  //ordenando por ordem crescente

    System.out.println("Exibindo os números ordenados por ordem crescente: " + numeros);

    sc.close();
  }
}