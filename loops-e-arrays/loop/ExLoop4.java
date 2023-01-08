package loop;
import java.util.Scanner;

public class ExLoop4 {
    
        public static void main(String[] args){

            Scanner sc = new Scanner(System.in);
            /*
             * Faça um programa que peça N números inteiros. 
             * Calcule e mostre a quantidade de números pares e a quantidade de números impares.
             */

            int count = 0;
            int numero;
            System.out.println("Informe a quantidade de números: ");
            int qntdNumeros = sc.nextInt();
            int qntdPar = 0, qntdImpar = 0;
                        
            do{
                System.out.println("Informe o número: ");
                numero = sc.nextInt();
                if (numero % 2 == 1) qntdImpar++;
                else qntdPar++;

                count++;
            } while (count < qntdNumeros);

            System.out.println("Quantia de números ímpares: " + qntdImpar);
            System.out.println("Quantia de números pares: " + qntdPar);
        }
}
