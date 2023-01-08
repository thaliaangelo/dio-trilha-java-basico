package ordenacaoMap;
import java.util.*;

public class Main {
    public static void main(String[] args){

        /*
         * Autor: Hawking, Stephen  nomeLivro: Uma breve história do tempo, páginas: 256
         * Autor: Duhigg, Charles, nomelivro: O poder do hábito, paginas: 488
         * Autor: Harari, Yuval Noah nomeLivro: 21 liçoes para o século 21, paginas: 432
         */

         //Ordenar para exibir o nome do livro e o autor 
         //Ordem aleatória
         Map<String, Livro> meusLivros = new HashMap<>(){{
            put("Hawking, Stephen", new Livro("Uma breve história do tempo", 256));
            put("Duhigg, Charles", new Livro("O poder do hábito", 488));
            put("Harari, Yuval Noah", new Livro("21 lições para o século 21", 432));
         }};

         for(Map.Entry<String, Livro> livro : meusLivros.entrySet()){
            System.out.println("Nome: " + livro.getValue().getNome() +  " - "  + "Autor: " + livro.getKey() + " - " + "Páginas: " + livro.getValue().getNumeroPaginas());
         }

         System.out.println();

         //Ordem inserção
         Map<String, Livro> meusLivros2 = new LinkedHashMap<>(){{
            put("Hawking, Stephen", new Livro("Uma breve história do tempo", 256));
            put("Duhigg, Charles", new Livro("O poder do hábito", 488));
            put("Harari, Yuval Noah", new Livro("21 lições para o século 21", 432));
         }};
         for(Map.Entry<String, Livro> livro : meusLivros2.entrySet()){
            System.out.println("Nome: " + livro.getValue().getNome() +  " - "  + "Autor: " + livro.getKey() + " - " + "Páginas: " + livro.getValue().getNumeroPaginas());
         }
         System.out.println();

         //Ordem alfabética atores
         Map<String, Livro> meusLivros3 = new TreeMap<>(meusLivros2);
         for(Map.Entry<String, Livro> livro : meusLivros3.entrySet()){
            System.out.println("Nome: " + livro.getValue().getNome() +  " - "  + "Autor: " + livro.getKey() + " - " + "Páginas: " + livro.getValue().getNumeroPaginas());
         }

         System.out.println();

         //Ordem alfabética nome dos livros
         Set<Map.Entry<String, Livro>> meusLivros4 = new TreeSet<>(new ComparatorNome());
         meusLivros4.addAll(meusLivros2.entrySet());
         for(Map.Entry<String, Livro> livro : meusLivros4){
            System.out.println("Nome: " + livro.getValue().getNome() +  " - "  + "Autor: " + livro.getKey() + " - " + "Páginas: " + livro.getValue().getNumeroPaginas());
         }
         System.out.println();

         //Ordem numero de paginas
         Set<Map.Entry<String, Livro>> meusLivros5 = new TreeSet<>(new ComparatorNumeroPaginas());
         meusLivros5.addAll(meusLivros2.entrySet());
         for(Map.Entry<String, Livro> livro : meusLivros5){
            System.out.println("Nome: " + livro.getValue().getNome() +  " - "  + "Autor: " + livro.getKey() + " - " + "Páginas: " + livro.getValue().getNumeroPaginas());
         }
    }
}
