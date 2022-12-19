import java.util.Scanner;

public class ExLoop5 {
    
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        /*
         * Desenvolva um gerador de tabuada, capaz de gerar a tabuada de qualquer número inteiro entre 1 a 10. 
         * O usuário deve informar de qual numero ele deseja ver a tabuada. A saída deve ser conforme o exemplo abaixo:

        Tabuada de 5:
        5 X 1 = 5
        5 X 2 = 10
        ...
        5 X 10 = 50
         */

        System.out.println("Informe a tabuada desejada: ");
        int tabuada = sc.nextInt();

        int resultado;

        System.out.println("Tabuada do " + tabuada);
        for (int i = 1; i <= 10; i++){
            resultado = tabuada * i;

            System.out.println(tabuada + " X " + i + " = " + resultado);
        }
    }
}
