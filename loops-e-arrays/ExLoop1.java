import java.util.Scanner;

public class ExLoop1{

        public static void main(String[] args){
            /*
             * Faça um programa que leia conjuntos de dois valores, 
             * o primeiro representando o nome do aluno e o segundo representando a sua idade.
             *  (Pare o programa inserindo o valor 0 no campo nome)
             */

             Scanner sc = new Scanner(System.in);

             while (true){
            System.out.println("Nome: ");

            sc.nextLine();
            String nome = sc.nextLine();

            if (nome.equals("0")) break;

            System.out.println("Idade: ");
            int idade = sc.nextInt();
             }

             System.out.println("Fim do Loop !");
            
        }
}