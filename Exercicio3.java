import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args){

            Scanner sc = new Scanner(System.in);

            int number;
            System.out.println("Informe um número: ");
            number = sc.nextInt();

            switch(number){
            case 1 : System.out.println("Certo");
            break;

            case 2 : System.out.println("Certo");
            break;

            case 3 : System.out.println("Certo");
            break; 
            
            case 4 : System.out.println("Errado");
            break;

            case 5 : System.out.println("Talvez");
            break;

            default : System.out.println("Valor indefinido");
            }

            sc.close();
    }
}
