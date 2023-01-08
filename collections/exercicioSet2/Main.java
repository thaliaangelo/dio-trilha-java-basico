package exercicioSet2;
import java.util.*;

public class Main {
    public static void main(String[] args){
        /*
         * Serie 1 = Nome: jojo, genero: sobrenatural, tempoEpisodio: 25
         * Serie 2 = Nome: bocchi the rock, genero: slice of life, tempoEpisodio: 20
         * Serie 3 = Nome: one piece, genero: acao, tempoEpisodio: 24
         */

         //Ordem aleatorioa
         Set<Serie> minhasSeries = new HashSet<>(){{
            add(new Serie("jojo", "sobrenatural", 25));
            add(new Serie("bocchi the rock", "slice of life", 20));
            add(new Serie("one piece", "ação", 24));
         }};

         System.out.println(minhasSeries);
         System.out.println();
         //Ordem de inserção
         Set<Serie> minhasSeries2 = new LinkedHashSet<>(){{
            add(new Serie("jojo", "sobrenatural", 25));
            add(new Serie("bocchi the rock", "slice of life", 20));
            add(new Serie("one piece", "ação", 24));
         }};
         System.out.println(minhasSeries2);
         System.out.println();

         //Ordem natural tempoEpisodio
         Set<Serie> minhasSeries3 = new TreeSet<>(){{
            add(new Serie("Akebi-chan", "sobrenatural", 20));
            add(new Serie("bocchi the rock", "slice of life", 20));
            add(new Serie("one piece", "ação", 24));
         }};

         System.out.println(minhasSeries3);
         System.out.println();

         Set<Serie> minhasSeries4 = new TreeSet<>(new ComparatorNomeGeneroTempoEpisodio()){{
            add(new Serie("Akebi-chan", "slice of life", 20));
            add(new Serie("Akebi-chan", "slice of life", 25));
            add(new Serie("one piece", "ação", 24));
         }};
         
         System.out.println(minhasSeries4);
         System.out.println();

         Set<Serie> minhasSeries5 = new TreeSet<>(new ComparatorGenero()){{
            add(new Serie("jojo", "sobrenatural", 25));
            add(new Serie("bocchi the rock", "slice of life", 20));
            add(new Serie("one piece", "ação", 24));
         }};
         
         System.out.println(minhasSeries5);
         System.out.println();

         Set<Serie> minhasSeries6 = new TreeSet<>(new ComparatorTempoEpisodio());
         minhasSeries6.addAll(minhasSeries);
         System.out.println(minhasSeries6);
    }
}
