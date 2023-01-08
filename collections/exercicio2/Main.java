package exercicio2;
import java.util.*;

public class Main {
    public static void main(String[] args){

        
        List<Pessoa> lista = new ArrayList<Pessoa>();

        lista.add(new Pessoa("Lindinha", 17)); //Novo elemento da lista
        lista.add(new Pessoa("Lindinha", 6));
        lista.add(new Pessoa("Gutinho", 10));


        //Comparação por nome
        Collections.sort(lista, new PessoaComparatePorNome()); //Organiza os nomes em ordem alfabética
        
        for (Pessoa nome : lista){
            System.out.println(nome.getNome());
        }

        //Comparação por idade
        Collections.sort(lista, new PessoaComparatePorIdade()); //Organiza as idades da menor para a maior

        for (Pessoa idade : lista) {
            System.out.println(idade.getIdade());
        }

        //Comparacao por nome e idade
        Collections.sort(lista, new PessoaComparateNomeIdade());
        System.out.println(lista);
    }
}
