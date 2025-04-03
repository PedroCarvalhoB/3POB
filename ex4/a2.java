import java.util.Scanner;

public class a2 {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    float vetor[] = new float[4];
    float soma=0, media;
    int i=0;
    
    for(i=0; i<4; i++) {
      
      System.out.println("Entre com uma nota: ");
      vetor[i] = sc.nextFloat();
      soma+=vetor[i];
    }

    media = soma/i;   

    System.out.println("A média do(a) aluno(a) é: " + media);
    if(media>=7)
      System.out.println("Aprovado!");
     else 
      System.out.println("Reprovado!");
      
    sc.close();
  }
}