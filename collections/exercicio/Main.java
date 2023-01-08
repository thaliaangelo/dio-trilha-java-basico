package exercicio;

import java.util.*;

public class Main {
    public static void main(String[] args){

        List<Pessoa> lista = new ArrayList<Pessoa>();

        lista.add(new Pessoa("Thalia", 17)); //Novo elemento da lista
        lista.add(new Pessoa("Lindinha", 6));
        lista.add(new Pessoa("Gutinho", 10));

        Collections.sort(lista);
        
        System.out.println(lista.toString());

    }    
}
