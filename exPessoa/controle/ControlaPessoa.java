package exPessoa.controle;

import exPessoa.dominio.*;

import java.util.Scanner;

public class ControlaPessoa {
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
  
        System.out.print("Digite o nome: ");
        String nome = sc.nextLine();

        System.out.print("Digite a idade: ");
        int idade = sc.nextInt();

        System.out.print("Digite a altura: ");
        double altura = sc.nextDouble();

        System.out.print("Digite a peso: ");
        double peso = sc.nextDouble();

        System.out.print("Digite o sexo: ");
        String sexo = sc.nextLine();

        Pessoa pessoa = new Pessoa(nome,idade,altura,peso,sexo);

        System.out.println("\nDados da pessoa:");
        pessoa.listarPessoa();
        System.out.print(pessoa.classificarIMC());

        sc.close();  // Fechar o Scanner após o uso
    }
}