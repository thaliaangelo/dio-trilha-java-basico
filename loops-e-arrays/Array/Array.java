package Array;

import java.util.Random;

public class Array {
    
    public static void main(String[] args){
        
        Random random = new Random();
        /*
         * Gere e imprima uma matriz M 4x4 com valores aleatórios entre 0-9. 
         */

         int[][] M = new int[4][4];

         System.out.println("Matriz: ");

         for(int i = 0; i < M.length; i++){
            for(int j = 0; j < M[i].length; j++){
                int numeroAleatorio = random.nextInt(9);
                M[i][j] = numeroAleatorio;
            }
         }

         for(int[] linha : M){
            for(int coluna : linha){
                System.out.print(coluna + " ");
            }
            System.out.println();
         }
    }
}
