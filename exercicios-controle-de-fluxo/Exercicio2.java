import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args){

        //Dia da semana com utilização do switch

        Scanner sc = new Scanner(System.in);

        String diaDaSemana;

        System.out.println("Informe um dia da semana");
        diaDaSemana = sc.nextLine();

        switch(diaDaSemana){
            case "Domingo": System.out.println("1");;
            break;

            case "Segunda": System.out.println("2");
            break;

            case "Terça" : System.out.println("3");
            break;

            case "Quarta" : System.out.println("4");
            break;

            case "Quinta" : System.out.println("5");
            break;

            case "Sexta" : System.out.println("6");
            break;

            case "Sabado" : System.out.println("7");
            break;

            default : System.out.println("Informe um dia da semana válido");
        }
    }
}
