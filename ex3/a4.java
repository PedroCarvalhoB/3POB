import java.util.Scanner;
import java.util.Locale;

public class a4 {
 
  public static void main(String[] args) {

    Scanner entrada = new Scanner(System.in);
    System.out.println("Entre com a quantidade de alunos na turma: ");
    int quantAlunos = entrada.nextInt();

    float soma=0;
    for(int i = 1; i<=quantAlunos; i++) {
      
      System.out.println("Entre com a nota do aluno: ");
      entrada.useLocale(Locale.US); // Define o formato de números com ponto decimal
      float nota = entrada.nextFloat();
      soma+= nota;
    }

    float mediaNotas = soma/quantAlunos;
    System.out.println("A media das notas de todos os alunos é: " + mediaNotas);

    entrada.close();
  }
}