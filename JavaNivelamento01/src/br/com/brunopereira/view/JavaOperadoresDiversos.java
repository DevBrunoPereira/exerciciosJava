package br.com.brunopereira.view;

import java.util.Scanner;

public class JavaOperadoresDiversos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int valorA = sc.nextInt();
        int valorB = sc.nextInt();
        
        System.out.println("Valor com -" + -- valorA );
        System.out.println("Valor com +" + valorB ++);
        System.out.println(valorA + valorB);
        
    }
}
