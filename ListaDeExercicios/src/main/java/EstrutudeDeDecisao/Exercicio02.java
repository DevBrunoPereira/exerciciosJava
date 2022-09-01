package EstrutudeDeDecisao;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        //Faça um Programa que peça um 
        //valor e mostre na tela se o 
        //valor é positivo ou negativo.
        int valor;
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um valor: ");
        
        valor = sc.nextInt();
        if(valor >= 0){
            System.out.println("Valor positivo!");
        }
        else{
            System.out.println("valor negativo!");
        }

    }
}
