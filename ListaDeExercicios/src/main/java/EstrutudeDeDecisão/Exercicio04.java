package EstrutudeDeDecisão;

import java.util.Scanner;

public class Exercicio04 {
    //Faça um Programa que verifique se uma letra digitada é vogal ou consoante.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String letra;
        System.out.print("Digite uma letra: ");
        letra = sc.next().toUpperCase();
        System.out.println("A letra Digitada foi: " + letra);

        if("A".equalsIgnoreCase(letra) || "e".equalsIgnoreCase(letra) || "i".equalsIgnoreCase(letra) || "o".equalsIgnoreCase(letra) || "o".equalsIgnoreCase(letra)){
            System.out.println("Vogal");
        }
        else{
            System.out.println("Consoante");
        }

    }
}
