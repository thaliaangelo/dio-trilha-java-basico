package Array;
import java.util.Scanner;

public class ExercicioArray2 {
    
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        /*
         * Faça um Programa que leia 4 notas, mostre as notas e a média na tela
         */

         double[] notas = new double[4];
         double nota;
         double media = 0;
         
         System.out.println("Informe as notas: ");

         for (int i = 0; i < notas.length; i++){
            System.out.print("Nota: ");
            nota = sc.nextDouble();
            notas[i] = nota;
         }

         for (int i = 0; i < notas.length; i++){
            media += notas[i];
         }

         System.out.print("Notas: ");
         for (double valorNota: notas){
            System.out.print(valorNota + " ");
         }

         System.out.println();

         System.out.println("Média: " + media/4);


    }
}
