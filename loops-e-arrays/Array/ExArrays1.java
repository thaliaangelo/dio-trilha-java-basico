package Array;
public class ExArrays1 {
    
    public static void main(String[] args){

        /*
         * Faça um Programa que leia um vetor de 5 números inteiros 
         * e mostre-os na ordem inversa
         */

        int[] vetor = {10, 8, 1, 3, 9};

        System.out.print("Números na ordem: ");
        for (int i = 0; i < vetor.length; i++){
            System.out.print(vetor[i] + " ");
        }

        System.out.println();

        System.out.print("Números na ordem inversa: ");
        for (int i = (vetor.length-1); i >= 0; i--){ // O contador começa com a quantidade de espaço que tem no array, e mostra o output do valor que está nesse determinado espaço. 
            System.out.print(vetor[i] + " ");
        }


    }
}
