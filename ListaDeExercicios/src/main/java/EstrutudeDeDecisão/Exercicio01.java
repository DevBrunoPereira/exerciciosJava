package EstrutudeDeDecisão;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        //Faça um Programa que peça dois números e imprima o maior deles.
        Scanner sc = new Scanner(System.in);

        int valor01, valor02;

        System.out.print("Digite um valor: ");
        valor01 = sc.nextInt();

        System.out.print("Digite outro valor: ");
        valor02 = sc.nextInt();

        if(valor01 > valor02){
            System.out.println("Valor " + valor01 + " é maior que " + valor02);
        }
        else{
            System.out.println("Valor " + valor02 + " é maior que " + valor01);
        }
    }
}
