package EstruturaSequencial;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
        
        String nome;
        int idade;
        float altura;
        
        System.out.print("Digite seu nome: ");
        nome = ler.next();
        
        System.out.print("Digite sua idade: ");
        idade = ler.nextInt();
        
        System.out.print("Digite sua altura: ");
        altura = ler.nextFloat();
        
        System.out.println("\n\nNome: "+ nome +"\nIdade: " + idade + "\nAltura: " + altura);
                
        
        ler.close();
    }
}
