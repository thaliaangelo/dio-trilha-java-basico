package exercicioSet3;
import java.util.*;

public class Main {
    public static void main(String[]args){ 
        Set<String> arcoIris = new HashSet<>();
        arcoIris.add("Vermelho");
        arcoIris.add("Azul");
        arcoIris.add("Verde");
        arcoIris.add("Amarelo");
        arcoIris.add("Laranja");
        arcoIris.add("Violeta");
        arcoIris.add("Anil");

        //Exiba todas as cores uma abaixo da outra
       /* for (String cor : arcoIris){
            System.out.println(cor);
        } */

        //Exiba as cores em ordem alfabética
        Set<String> arcoIris2 = new TreeSet<>();
        arcoIris2.addAll(arcoIris);
        System.out.println(arcoIris2);
        System.out.println();

        //Exiba as cores na ordem inversa que foi informada
        List<String> arcoIris3 = new ArrayList<>(arcoIris2);

        Collections.reverse(arcoIris3);

        System.out.println(arcoIris3);
        System.out.println();

        //Exiba todas as cores que começam com a letra V
        for (String cor : arcoIris2){
            if(cor.contains("V") == true){
                System.out.println(cor);
            }
        }

        //Remova todas as cores que não começa com a letra V
        Iterator<String> it = arcoIris2.iterator();
        while(it.hasNext()){
            String cor = it.next();
                if (cor.contains("V") != true){
                    it.remove();
                }
        }
        System.out.println(arcoIris2);

        //Limpe o conjunto
        arcoIris2.clear();

        //Verifique se o conjuto está vazio
        System.out.println("O conjunto está vazio ? " + arcoIris2.isEmpty());
        
    }
}
