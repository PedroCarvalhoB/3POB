import java.util.ArrayList;
import java.util.Scanner;

public class a2 {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    ArrayList<String> nomes = new ArrayList<>();

    for(int i=0; i<5; i++) {

      System.out.println("Entre com um nome: ");
      String str = sc.next();
      nomes.add(str);
    }

    for(int i=0; i<nomes.size(); i++) {

      System.out.println(nomes.get(i));
    }

    System.out.println("Qual nome você quer remover: ");
    String strRemovida = sc.next();
    nomes.remove(strRemovida); 
    
    for(int i=0; i<nomes.size(); i++) {

      System.out.println(nomes.get(i));
    }

    sc.close();
  }
}