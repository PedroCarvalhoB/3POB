import java.util.Scanner;

public class a5 {
 
  public static void main(String[] args) {

    Scanner entrada = new Scanner(System.in);
    System.out.println("Entre com o primeiro número inteiro positivo: ");  //pedindo o 1º valor
    int num1 = entrada.nextInt();

    System.out.println("Entre com o segundo número inteiro positivo: ");  //pedindo o 2º valor
    int num2 = entrada.nextInt();

    System.out.println("Os números primos desse intervalo são: ");
    int verificador;  //criando uma variável para verificar se é primo
    for(int i=num1+1; i<num2; i++) {  

      verificador=0;
      for(int j=1; j<=i; j++) {
        
        if(i%j==0) {

          verificador++;
        }
      }

      if(verificador<3) {  //imprimindo os números primos do intervalo

        System.out.println(i);
      }
    }

    entrada.close();
  }
}