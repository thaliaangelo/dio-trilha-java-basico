package exercicioMap2;
import java.util.*;

public class Dado {
    public static void main(String[] args){
        Random random = new Random();
        /*
         *  Faça um programa que simule um lançamento de dados.
            Lance o dado 100 vezes e armazene.
            Depois, mostre quantas vezes cada valor foi inserido.
         */
        List<Integer> dados = new ArrayList<>();
        int numero;
        for(int i = 0; i < 100; i++){
            numero = random.nextInt(6);
            dados.add(numero);
        }

        int soma1 = 0;
        int soma2 = 0;
        int soma3 = 0;
        int soma4 = 0;
        int soma5 = 0;
        int soma6 = 0;

        for(Integer valor : dados){
            switch(valor){
                case 0: soma1++;
                break;

                case 1: soma2++;
                break;

                case 2: soma3++;
                break;

                case 3: soma4++;
                break;

                case 4: soma5++;
                break;

                case 5: soma6++;
                break;
            }
        }

        System.out.println("1 - " + soma1);
        System.out.println("2 - " + soma2);
        System.out.println("3 - " + soma3);
        System.out.println("4 - " + soma4);
        System.out.println("5 - " + soma5);
        System.out.println("6 - " + soma6);
    }    
}
