
package EstruturaSequencial;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        //Faça um Programa que peça as 4 notas bimestrais e mostre a média.
        Scanner ler = new Scanner(System.in);
        float n1,n2,n3,n4,resultado;
        
        System.out.print("Digite sua primeira nota: ");
        n1 = ler.nextFloat();
        
        System.out.print("Digite sua Segunda nota: ");
        n2 = ler.nextFloat();
        
        System.out.print("Digite sua Terceira nota: ");
        n3 = ler.nextFloat();
        
        System.out.print("Digite sua quarta nota: ");
        n4 = ler.nextFloat();
        
        resultado = (n1+n2+n3+n4)/4;
        
        System.out.println("Media: "+ resultado);
        
    }
    
}
