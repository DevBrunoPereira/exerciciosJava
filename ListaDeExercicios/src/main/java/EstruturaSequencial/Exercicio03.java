package EstruturaSequencial;

import java.util.Scanner;

public class Exercicio03 {
    //Faça um Programa que peça dois números e imprima a soma.
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int numero1, numero2, resultado;
        
        System.out.print("Digite um valor inteiro: ");
        numero1 = ler.nextInt();
        
        System.out.print("Digite um outro valor inteiro: ");
        numero2 = ler.nextInt();
        
        resultado = numero1 + numero2;
        
        System.out.println("A soma de " + numero1 + " + " + numero2 + " = " + resultado);
        
    }
}
