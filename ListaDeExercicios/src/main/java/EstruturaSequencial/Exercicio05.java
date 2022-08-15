package EstruturaSequencial;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        //Faça um Programa que converta metros para centímetros.
        Scanner ler = new Scanner(System.in);
        
        float centimetro = 100;
        float metro, resultado;
        
        System.out.print("Digite um valor em metro: ");
        metro = ler.nextFloat();
        
        resultado = metro * centimetro;
        System.out.println("Valor: "+ resultado +"cm");
        ler.close();
    }
}
