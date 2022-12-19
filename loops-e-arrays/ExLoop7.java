import java.util.Scanner;

public class ExLoop7 {
    
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        /*
         * Faça um programa que leia um nome de usuário e a sua senha e não aceite a senha igual ao nome do usuário, 
         * mostrando uma mensagem de erro e voltando a pedir as informações.
         */

         System.out.println("Informe o nome de usuário: ");
         String nomeUsuario = sc.next();
         System.out.println("Informe a sua senha: ");
         String senha = sc.next();

         while(senha.equals(nomeUsuario)){
            System.out.println("Informe uma senha diferente do nome de usuário !");
            senha = sc.next();
         }

        System.out.println("Usuário: " + nomeUsuario);
        System.out.println("Senha: " + senha); 
    }
}
