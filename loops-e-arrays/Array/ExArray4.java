package Array;
import java.util.Scanner;

public class ExArray4 {
    
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        /*
         * Faça um Programa que leia um vetor de 6 caracteres, e 
         * diga quantas consoantes foram lidas. Imprima as consoantes.
         */

         String[] consoantes = new String[6];
         int quantidadeConsoantes = 0;

         System.out.println("Informe a letra: ");

         for(int i = 0; i < consoantes.length; i++){
            System.out.print("Letra: ");
            String letra = sc.next();

            if (!(letra.equalsIgnoreCase("a") || 
                letra.equalsIgnoreCase("e") || 
                letra.equalsIgnoreCase("i") || 
                letra.equalsIgnoreCase("o") || 
                letra.equalsIgnoreCase("u"))){

                    consoantes[i] = letra;
                    quantidadeConsoantes++;
                }
         }

         System.out.print("Consoantes: ");
         for(String consoante : consoantes){
            if (consoante != null){
                System.out.print(consoante + " ");
            }
         }
         System.out.println("\nQuantidade de consoantes: " + quantidadeConsoantes);
    }
}
