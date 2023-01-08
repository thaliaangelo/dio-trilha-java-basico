package exercicioLista;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Lista1{
    public static void main(String[] args){

        //Dada uma lista com 7 notas de um aluno [7, 8.5, 9.3, 5, 7, 0, 3.6] faça:

        //Crie uma lista com as 7 notas
        List <Double> notas = new ArrayList<>();
        notas.add(7.0);
        notas.add(8.5);
        notas.add(9.3);
        notas.add(5.0);
        notas.add(7.0);
        notas.add(0.0);
        notas.add(3.6);
        System.out.println(notas.toString());

        //Exiba a posição da nota 5.0
        System.out.println("Posição da nota 5.0: " + notas.indexOf(5.0));

        //Confira se a nota 5.0 está na lista
        System.out.println("A nota 5.0 está na lista? " + notas.contains(5.0));

        //Substitua a nota 5.0 pela nota 6.0
        notas.set(notas.indexOf(5.0), 6.0); //Procura o elemento com o indexOf e o substitui

        //Confira se a nota 5.0 está na lista
        System.out.println("A nota 5.0 está na lista? " + notas.contains(5.0));

       // for (Double nota: notas){
       //     System.out.println(nota);
        //};
        
        //Exiba a 3 nota adicionada

        System.out.println("3 nota adicionada: " + notas.get(2));

        //Exiba a menor nota
        System.out.println("Menor nota: " + Collections.min(notas)); //Como não existe esse metodo no List, pode-se usar esse metodo do Collections, porque a interface List estende de Collections.

        //Exiba a maior nota
        System.out.println("Maior nota: " + Collections.max(notas));

        //Exiba a soma dos valores
        Iterator<Double> iterator = notas.iterator();
        double soma = 0;
        while(iterator.hasNext()){
            Double next = iterator.next();
            soma += next;
        }
        System.out.println("Soma dos valores: " + soma);

        //Exiba a média das notas
        System.out.println("Média: " + soma/notas.size());

        //Remova a nota 0
        notas.remove(0.0);
        System.out.println(notas);

        //Remova a nota do indice 0
        notas.remove(0);
        System.out.println(notas);

        //Remova todas as notas menores que 7
        Iterator<Double> iterator1 = notas.iterator();
        while(iterator1.hasNext()){
            Double next = iterator1.next();
            if (next < 7){
                iterator1.remove();
            }
        }

        System.out.println(notas);
    }
}