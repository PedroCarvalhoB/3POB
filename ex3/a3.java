import java.util.Scanner;

public class a3 {
  
  public static void main(String[] args) {

    Scanner entrada = new Scanner(System.in);
    System.out.println("Entre com um número inteiro positivo: ");
    int num = entrada.nextInt();

    int contador = num;
    
    System.out.println("CONTAGEM REGRESSIVA COMEÇANDO PELO NÚMERO " + num);
    do {

      System.out.println(contador);
      contador--;
    } while(contador!=0);

    entrada.close();
  }
}