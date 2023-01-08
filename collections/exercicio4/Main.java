package exercicio4;
import java.util.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        /*
         * Utilizando listas, faça um programa que faça 5 perguntas para uma
        pessoa sobre um crime. As perguntas são:
        "Telefonou para a vítima?"
        "Esteve no local do crime?"
        "Mora perto da vítima?"
        "Devia para a vítima?"
        "Já trabalhou com a vítima?"
        Se a pessoa responder positivamente a 2 questões ela deve ser
        classificada como "Suspeita", entre 3 e 4 como "Cúmplice" e 5 como
        "Assassina". Caso contrário, ela será classificado como "Inocente". 
         */

         List<String> respostas = new ArrayList<>();
         System.out.println("Telefonou para a vitima? ");
         respostas.add(sc.next());

         System.out.println("Esteve no local do crime? ");
         respostas.add(sc.next());

         System.out.println("Mora perto da vitima? ");
         respostas.add(sc.next());

         System.out.println("Devia para a vitima? ");
         respostas.add(sc.next());

         System.out.println("Já trabalhou com a vitima? ");
         respostas.add(sc.next());

         int count = 0;
         Iterator<String> it = respostas.iterator();
         while(it.hasNext()){
            String resp = it.next();
            switch(resp){
                case ("sim") : count++;
                break;

                case("não") : 
                break;
            }
        }
        switch(count){
            case 0 :
            
            case 1: System.out.println("Inocente");
            break;

            case 2: System.out.println("Suspeita");
            break;

            case 3: 

            case 4: System.out.println("Cúmplice");
            break;

            case 5: System.out.println("Assassina");
            break;
        }
    }
}
