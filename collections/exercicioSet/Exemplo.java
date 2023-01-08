package exercicioSet;
import java.util.*;
public class Exemplo {
    public static void main(String[] args){

        //[7, 8.5, 9.3, 5, 7, 0, 3.6]

        //Criar uma lista e adicionar as notas
        Set<Double> notas = new HashSet<>(Arrays.asList(7.0, 8.5, 9.3, 5.0, 7.0, 0.0, 3.6));

        System.out.println(notas);

        //Lista com ordem de inserção
        Set<Double> notas2 = new LinkedHashSet<>();
        notas2.add(7.0);
        notas2.add(8.5);
        notas2.add(9.3);
        notas2.add(5.0);
        notas2.add(7.0);
        notas2.add(0.0);
        notas2.add(3.6);

        System.out.println(notas2);

        //Lista com ordem natural
        Set<Double> notas3 = new TreeSet<>(notas2); //Só pode usar o notas2 porque ele é do tipo Double, e já tem a interface Comparable, se ele não tivesse, não poderia comparar os elementos sozinho.
        System.out.println(notas3);
    }
}
