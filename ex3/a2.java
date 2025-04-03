import java.util.Scanner;

public class a2 {
 
  public static void main(String[] args) {

    Scanner entrada = new Scanner(System.in);
    System.out.println("Entre com um número entre 1 a 10: ");  //pedindo ao usuário um número
    int num = entrada.nextInt();

    if(num<1 || num>10) {  //verificando se o número é válido

      System.err.println("Número inválido!");
      System.exit(0);
    }

    int contador=0;  //inicializando um contador 
    System.out.println("TABUADA DE " + num);
    while(contador<11) {  //exibindo a tabuada de 'num'
    
      System.out.println(num + " * " + contador + " = " + num*contador);
      contador++;
    }

    entrada.close();
  }
}