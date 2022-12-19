import java.util.Scanner;

public class ExLoop3 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        /*
         * Faça um programa que leia 5 números e 
         * informe o maior número e a média desses números.
         */

        int numero;
        int maior = 0;
        int count = 0;
        int soma = 0;

        do{
            System.out.println("Informe um número: ");
            numero = sc.nextInt();
            if (numero > maior) maior = numero; // Se o numero informado for maior que a variavel maior, o maior vai receber esse numero.
            soma += numero; //soma = soma + numero
            count++;
        } while (count < 5);

        System.out.println("Maior número: " + maior);
        System.out.println("Média: " + (soma / 5));
    }
}
