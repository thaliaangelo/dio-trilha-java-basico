package Array;
import java.util.Scanner;

public class ExArray5 {
    
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        /*
         * Capture do teclado valores para preenchimento de uma matriz M 3x3. 
         * Após a captura imprima a matriz criada e encontre a quantidade de números 
         * pares, a quantidade de números ímpares.
         */

         int[][] M = new int[3][3];
         int qntdPar = 0;
         int qntdImpar = 0;
         
         System.out.println("Informe os valores: ");
         for(int i = 0; i < M.length;  i++){
            for(int j = 0; j < M[i].length; j++){
                M[i][j] = sc.nextInt();
            }
         }

         System.out.println("Matriz: ");
         for(int[] linha: M){
            for(int coluna: linha){
                System.out.print(coluna + " ");
                if (coluna % 2 == 0){
                    qntdPar++;
                } else {
                    qntdImpar++;
                }
            }

            System.out.println();
        }
        System.out.println("Quantidade de pares: " + qntdPar);
        System.out.println("Quantidade de impar: " + qntdImpar);
    }
}
