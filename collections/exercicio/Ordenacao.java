package exercicio;
import java.util.*;

public class Ordenacao {
    
    public static void main(String[] args){

        List<Integer> lista = new ArrayList<>();

        lista.add(10);
        lista.add(89);
        lista.add(3);
        lista.add(67);
        lista.add(34);

        Collections.sort(lista);

        System.out.println(lista);
    }
}
