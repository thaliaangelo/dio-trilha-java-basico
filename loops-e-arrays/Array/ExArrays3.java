package Array;
import java.util.Random;

public class ExArrays3 {
    
    public static void main(String[] args){

        Random random = new Random();
        /*
         * Faça um Programa que leia 20 números inteiros aleatórios (entre 0 e 100) armazene-os num vetor. 
         * Ao final, mostre os números e seus sucessores.
         */

        int[] vetor = new int[20];
        int numero;

        for(int i = 0; i < vetor.length; i++){
            numero = random.nextInt(100);
            vetor[i] = numero;
        }

        System.out.print("Numeros: ");
        for(int numeroAleatorio : vetor){
            System.out.print(numeroAleatorio + " ");
        }

        System.out.println();

        System.out.print("Sucessores: ");
        for(int numeroAleatorio : vetor){
            System.out.print((numeroAleatorio + 1) + " ");
        }
    }
}
