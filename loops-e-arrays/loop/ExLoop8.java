package loop;
import java.util.Scanner;

public class ExLoop8 {
    
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        /*
         * Faça um programa que leia e valide as seguintes informações:
        Nome: maior que 3 caracteres;
        Idade: entre 0 e 150;
        Salário: maior que zero;
        Sexo: 'f' ou 'm';
        Estado Civil: 's', 'c', 'v', 'd';
         */

         System.out.println("Informe seu nome: ");
         String nome = sc.next();
         while(nome.length() < 3){
            System.out.println("Informe um nome maior que 3 caracteres! ");
            nome = sc.next();
         }

         System.out.println("Informe a sua idade: ");
         int idade = sc.nextInt();
         while (idade < 0 || idade > 150){
            System.out.println("Informe uma idade maior que 0 e menor que 150!");
            idade = sc.nextInt();
         }

         System.out.println("Informe seu salário: ");
         double salario = sc.nextDouble();
         while(salario < 0){
            System.out.println("Informe um salário maior que 0!");
            salario = sc.nextDouble();
         }

        System.out.println("Informe o sexo 'f' ou 'm': ");
        char sexo = sc.next().charAt(0);
        while(sexo != 'f' && sexo != 'm'){
            System.out.println("Informe se é 'f' ou 'm'! ");
            sexo = sc.next().charAt(0);
        }

         System.out.println("Estado civil 's', 'c', 'v', 'd' ");
         char estadoCivil = sc.next().charAt(0);
         while(estadoCivil != 's' && estadoCivil != 'c' && estadoCivil != 'v' && estadoCivil != 'd'){
            System.out.println("Informe se é 's', 'c', 'v', ou 'd'! ");
            estadoCivil = sc.next().charAt(0);
         }
         

         System.out.println("Nome: " + nome);
         System.out.println("Idade: " + idade);
         System.out.println("Salário: " + salario);
         System.out.println("Sexo: " + sexo);
         System.out.println("Estado civil: " + estadoCivil);
    }
}
