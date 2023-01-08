package Array;

import java.util.Scanner;

public class ExercicioArray7 {
    
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        /*
         * Faça um programa para jogar o jogo da velha. 
         * O programa deve permitir que dois jogadores façam uma partida do jogo da velha, 
         * usando o computador para ver o tabuleiro. 
         * Cada jogador vai alternadamente informando a posição onde deseja colocar a sua peça (‘O’ ou ‘X’). 
         * O programa deve impedir jogadas inválidas e determinar automaticamente quando o jogo terminou 
         * e quem foi o vencedor (jogador1 ou jogador2). 
         * A cada nova jogada, o programa deve atualizar a situação do tabuleiro na tela.
         */

        String[][] tabuleiro = new String[3][3];

        System.out.println("Começando o jogo. ");

        for(int i = 0; i < tabuleiro.length; i++){
            System.out.println("\nJogador 1: ");
            System.out.print("Linha: ");
            int linha = sc.nextInt();
            System.out.print("Coluna: ");
            int coluna = sc.nextInt();

            if(tabuleiro[linha][coluna] == null){
                tabuleiro[linha][coluna] = " X ";
                System.out.println("Tabuleiro: ");
                for(String[] reta : tabuleiro){
                    for(String lacuna : reta){
                        if (lacuna != null)
                        System.out.print(tabuleiro[linha][coluna]);
                    }
                    System.out.println();
                }
                System.out.println();
                
            } else {
                System.out.println("\nFaça uma jogada válida");
                System.out.print("Linha: ");
                linha = sc.nextInt();
                System.out.print("Coluna: ");
                coluna = sc.nextInt();
                tabuleiro[linha][coluna] = " X ";
                System.out.println("Tabuleiro: ");
                for(String[] reta : tabuleiro){
                    for(String lacuna : reta){
                        if (lacuna != null)
                        System.out.print(lacuna + " - ");
                    }
                    System.out.println();
                }
                System.out.println();
            }

            System.out.println("\nJogador 2: ");
            System.out.print("Linha: ");
            linha = sc.nextInt();
            System.out.print("Coluna: ");
            coluna = sc.nextInt();
            if(tabuleiro[linha][coluna] == null){
                tabuleiro[linha][coluna] = " O ";
                System.out.println("Tabuleiro: ");
                for(String[] reta : tabuleiro){
                    for(String lacuna : reta){
                        if (lacuna != null)
                        System.out.print(lacuna + " - ");
                    }
                    System.out.println();
                }
                System.out.println();

            } else {
                System.out.println("\nFaça uma jogada válida");
                System.out.print("Linha: ");
                linha = sc.nextInt();
                System.out.print("Coluna: ");
                coluna = sc.nextInt();
                tabuleiro[linha][coluna] = " O ";
                System.out.println("Tabuleiro: ");
                for(String[] reta : tabuleiro){
                    for(String lacuna : reta){
                        if (lacuna != null)
                        System.out.print(lacuna + " - ");
                    }
                    System.out.println();
                }
                System.out.println();
            }
            }
        }
}
    

