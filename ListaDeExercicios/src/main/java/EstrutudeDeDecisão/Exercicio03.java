package EstrutudeDeDecisão;

import java.util.Scanner;

import javax.sound.midi.SysexMessage;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String valor;
        System.out.print("Digite M para masculino e F para feminino:  ");
        valor = sc.next().toUpperCase();

        System.out.println("Valor Digitado: " + valor + "\n \n");

        if("F".equalsIgnoreCase(valor)){
            System.out.println("Feminino");
        }
        else if ("M".equalsIgnoreCase(valor)){
            System.out.print("Masculino");
        }
        else{
            System.out.println("valor Incorreto");
        }

    }
}
