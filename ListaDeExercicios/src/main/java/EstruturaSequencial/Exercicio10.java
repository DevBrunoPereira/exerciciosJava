package EstruturaSequencial;

import java.util.Scanner;

/**
 * Faça um Programa que peça a temperatura em 
 * graus Celsius, transforme e mostre em graus
 * Fahrenheit.
 * Formula C/5 = (F-32)/9
 */
public class Exercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        
        float celsius, fahrenheit, valorCesius, valorFare;
        float valor1 = 32;
        float valor2 = 9;


        System.out.print("Digite o valor em Celsius: ");
        celsius = sc.nextFloat();
        valorCesius = celsius / 5;
        

    }
}
