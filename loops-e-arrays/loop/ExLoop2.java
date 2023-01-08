package loop;
import java.util.Scanner;

public class ExLoop2 {
        public static void main(String[] args){

                Scanner sc = new Scanner(System.in);
        /*
         * Faça um programa que peça uma nota, entre zero e dez.
         *  Mostre uma mensagem caso o valor seja inválido e 
         * continue pedindo até que o usuário informe um valor válido.
         */

                System.out.println("Informe uma nota: ");
                int nota = sc.nextInt();

                while(nota < 0 || nota > 10){
                        System.out.println("Valor inválido, digite uma nota novamente: ");
                        nota = sc.nextInt();
                }

                System.out.println("Fim do Loop !");
        }
}
