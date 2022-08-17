package EstruturaSequencial;

import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {
        //Faça um Programa que peça a temperatura em graus Fahrenheit, 
        //transforme e mostre a temperatura em graus Celsius.
        //C = 5 * ((F-32) / 9).
        Scanner sc = new Scanner(System.in);
              
        float celsius, fahrenheit;
        System.out.print("Digite a temperatura em Fahrenheit: ");
        fahrenheit = sc.nextFloat();
        celsius = 5 * ( (fahrenheit - 32) / 9 );
        
        System.out.println("Celsius: "+ celsius +"C");
        sc.close();
    }
}
