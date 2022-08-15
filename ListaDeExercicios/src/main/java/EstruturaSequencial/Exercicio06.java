package EstruturaSequencial;

import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        //Faça um Programa que peça o raio de um círculo, calcule e mostre sua área.
        //A = pi*raio*raio
        float PI = 3.1415f;
        float raio, area;
        Scanner ler = new Scanner(System.in);
        
        System.out.print("Informe o valor do raio do círculo: ");
        raio = ler.nextFloat();
        area = (float) (PI * (Math.pow(raio, 2)));
        
        System.out.println("O valor da area do circulo é: " + area);
        
        ler.close();
    }
}
