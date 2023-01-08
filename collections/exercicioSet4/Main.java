package exercicioSet4;
import java.util.*;

public class Main {
    public static void main(String[] args){
        //nome: java, anoCriacao: 1980, ide: eclipse
        //nome: phython, anoCriacao: 2000, ide: pycharm
        //nome: javascript, anoCriacao: 1995, ide: vscode

        //Ordem de inserção
        Set<LinguagemFavorita> linguagens = new LinkedHashSet<>(){{
            add(new LinguagemFavorita("Java", "Eclipse", 1980));
            add(new LinguagemFavorita("Phython", "Pycharm", 2000));
            add(new LinguagemFavorita("Java", "Vscode", 1995));
        }};

        for(LinguagemFavorita linguagem : linguagens){
            System.out.println("Nome: " + linguagem.getNome() + " - " + "Ide: " + linguagem.getIde() + " - " + "Ano de criação: " + linguagem.getAnoCriacao());
        }
        System.out.println();

        //Ordem natural (Nome)
        Set<LinguagemFavorita> linguagens2 = new TreeSet<>(linguagens);
        System.out.println("Ordem natural nome: ");
        for (LinguagemFavorita linguagem : linguagens2) {
            System.out.println(linguagem.getNome());
        }
        System.out.println();

        //Ordem natural ide
        Set<LinguagemFavorita> linguagens3 = new TreeSet<>(new ComparatorIde());
        linguagens3.addAll(linguagens);
        System.out.println("Ordem natural ide: ");
        for(LinguagemFavorita linguagem : linguagens3){
            System.out.println(linguagem.getIde());
        }
        System.out.println();
        
        //Ordem natural anoCriação e nome
        Set<LinguagemFavorita> linguagens4 = new TreeSet<>(new ComparatorAnoCriacaoNome());
        linguagens4.addAll(linguagens);
        System.out.println("Ordem natural ano de criação e nome: ");
        System.out.println(linguagens4);
        System.out.println();

        //Ordem natural nome, ide e ano de criação
        Set<LinguagemFavorita> linguagens5 = new TreeSet<>(new ComparatorNomeAnoCriacaoIde());
        linguagens5.addAll(linguagens);

        System.out.println("Ordem natural nome, ide e ano criação: ");
        for (LinguagemFavorita linguagem : linguagens5){
            System.out.println("Nome: " + linguagem.getNome() + " - " + "Ide: " + linguagem.getIde() + " - " + "Ano de criação: " + linguagem.getAnoCriacao());
        }
    }    
}
