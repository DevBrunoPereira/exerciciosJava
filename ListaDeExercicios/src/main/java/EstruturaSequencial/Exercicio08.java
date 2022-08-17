package EstruturaSequencial;

import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        //Faça um Programa que pergunte quanto 
        //você ganha por hora e o número de horas 
        //trabalhadas no mês. Calcule e mostre o 
        //total do seu salário no referido mês.
        Scanner sc = new Scanner(System.in);
        float horaTrabalhada;
        float diasTrabalhado;
        float valorHora;
        float salario;
        System.out.print("Informe o quantidade de Horas trabalhada no dia: ");
        horaTrabalhada = sc.nextFloat();
        
        System.out.print("Informe quantidade de dias Trabalhado: ");
        diasTrabalhado = sc.nextFloat();
        
        System.out.print("Informe o valor da Hora Trabalhada: ");
        valorHora = sc.nextFloat();
        
        //Formula para salario
        
        salario = (horaTrabalhada * diasTrabalhado) * valorHora;
        
        System.out.println("Salario: " + salario);
        
        sc.close();
    }
}
