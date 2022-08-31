package EstrutudeDeDecisão;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float n1, n2, n3, n4, media;

        System.out.print("Digite a primeira nota: ");
        n1 = sc.nextInt();

        System.out.print("Digite a segundo nota: ");
        n2 = sc.nextInt();

        System.out.print("Digite a terceiro nota: ");
        n3 = sc.nextInt();

        System.out.print("Digite a quarto nota: ");
        n4 = sc.nextInt();

        media = (n1+n2+n3+n4)/4;

        if(media >= 7){
            System.out.println("Aprovado");
        }
        else if(media < 6 && media > 4){
            System.out.println("Recuperação");
        }
        else{
            System.out.println("Reprovado");
        }

    }
}
