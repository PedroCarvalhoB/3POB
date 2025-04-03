import java.util.ArrayList;
import java.util.Scanner;  //importando a biblioteca do ArrayList

public class a1 {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    ArrayList<Integer> numeros = new ArrayList<>();  //criando um arraylist do tipo inteiro

    while(true) {

      System.out.println("Entre com um número inteiro(digite '-1' para sair): ");
      int num = sc.nextInt();
      if(num == -1) {

        break;  //para sair do loop
      }

      numeros.add(num);
    }

    System.out.println("Exibindo todos os números que foram digitados: ");
    for(int i=0; i<numeros.size(); i++) {

      System.out.println(numeros.get(i));
    }

    sc.close();
  }
}