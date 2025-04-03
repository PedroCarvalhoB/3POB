import java.util.ArrayList;
import java.util.Scanner;

public class a3 {
  
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    ArrayList<Double> numeros = new ArrayList<>();
    int soma = 0;

    while(true) {

      System.out.println("Entre com um número('-1' para sair): ");
      double num = sc.nextDouble();

      if(num == -1)
        break;
      
      numeros.add(num);
      soma += num;
    }

    float media = soma/numeros.size();
    System.out.println("A media dos números é: " + media);

    sc.close();
  }
}