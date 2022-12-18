import java.util.Scanner;

public class Exercicio1{
    public static void main(String[] args){

        //Mês do ano com utilização do if.
        
            Scanner sc = new Scanner(System.in);

            int mesDoAno;

            System.out.println("Informe o número do mês: ");
            mesDoAno = sc.nextInt();

            if (mesDoAno == 1){
                System.out.println("Janeiro");

            } else if (mesDoAno == 2){
                System.out.println("Fevereiro");

            } else if (mesDoAno == 3){
                System.out.println("Março");

            } else if (mesDoAno == 4){
                System.out.println("Abril");

            } else if (mesDoAno == 5){
                System.out.println("Maio");

            } else if (mesDoAno == 6){
                System.out.println("Junho");

            } else if (mesDoAno == 7){
                System.out.println("Julho");

            } else if (mesDoAno == 8){
                System.out.println("Agosto");

            } else if (mesDoAno == 9){
                System.out.println("Setembro");

            } else if (mesDoAno == 10){
                System.out.println("Outubro");

            } else if (mesDoAno == 11){
                System.out.println("Novembro");

            } else if (mesDoAno == 12) {
                System.out.println("Dezembro");

            } else {
                System.out.println("Informe um número válido, de 1 a 12.");
            }

            if (mesDoAno == 7 || mesDoAno ==12 || mesDoAno == 1){
                System.out.println("Férias");
            }
            sc.close();
    }
}