import java.util.Scanner;

public class ExLoop6 {
    
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        /*
         * Faça um programa que calcule o fatorial de um número inteiro fornecido pelo usuário.
        Ex.: 5!=5.4.3.2.1=120
         */

        System.out.println("Informe o fatorial desejado: ");
        int fatorial = sc.nextInt();
        int multiplicacao = 1;

        System.out.print(fatorial + "! = ");
        for (int i = fatorial; i >= 1; i--){
            multiplicacao *= i;
        }

        for (int i = fatorial; i > 1; i--){
            System.out.print(i + ".");
        }

        System.out.print("1 = ");

        System.out.print(multiplicacao);

    }
}
