package EstruturaSequencial;

import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        //Faça um Programa que calcule a área 
        //de um quadrado, em seguida mostre o 
        //dobro desta área para o usuário.
        float base, altura, area;
        System.out.print("Digite o valor da base do quadrado: ");
        base = ler.nextFloat();
        System.out.print("Digite o valor da altura: ");
        altura = ler.nextFloat();
        area = 2 * (base * altura);
        System.out.println("O valor dobrado da area é: " + area);
        
        ler.close();
    }
}
