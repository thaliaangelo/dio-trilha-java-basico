package exercicioMap3;
import java.util.*;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentSkipListMap;
import java.util.function.Function;

public class Main{
    public static void main(String[] args){

    /* Dadas as seguintes informações de id e contato, crie um dicionario
     * e ordene este dicionario exibindo (Nome id - nome Contato)
     * id = 1 - Contato = nome : Simba, numero: 2222;
     * id = 2 - Contato = nome: Cami, numero: 5555;
     * id = 3 - Contato = nome: Jon, numero: 1111;
     */ 

     //Ordem aleatoria
     System.out.println("-- Ordem aleatória --");
     Map<Integer, Contato> meusContatos = new HashMap<>(){{
         put(3, new Contato("Jon", 1111));
         put(2, new Contato("Cami", 5555));
         put(1, new Contato("Simba", 2222));
     }};

     for(Map.Entry<Integer, Contato> contato: meusContatos.entrySet()){
        System.out.println("Id: " + contato.getKey() + " - " + "Nome: " + contato.getValue().getNome() + " - " + "Número: " + contato.getValue().getNumero());
     }

     //Ordem de inserção
     System.out.println("-- Ordem de inserção -- ");
     Map<Integer, Contato> meusContatos2 = new LinkedHashMap<>(){{
        put(1, new Contato("Simba", 2222));
        put(3, new Contato("Jon", 1111));
        put(2, new Contato("Cami", 5555));
     }};

     for(Map.Entry<Integer, Contato> contato: meusContatos2.entrySet()){
        System.out.println("Id: " + contato.getKey() + " - " + "Nome: " + contato.getValue().getNome() + " - " + "Número: " + contato.getValue().getNumero());
     }

     //Ordem natural Id
     System.out.println("-- Ordem natural --");
     Map<Integer, Contato> meusContatos3 = new TreeMap<>(meusContatos);
     for(Map.Entry<Integer, Contato> contato: meusContatos3.entrySet()){
        System.out.println("Id: " + contato.getKey() + " - " + "Nome: " + contato.getValue().getNome() + " - " + "Número: " + contato.getValue().getNumero());
     }

     //Ordem natural nome
     System.out.println("-- Ordem natural nome --");
     Set<Map.Entry<Integer, Contato>> meusContatos4 = new TreeSet<>(new ComparatorNome()){{
      addAll(meusContatos3.entrySet());
     }};

     for(Map.Entry<Integer, Contato> contato: meusContatos4){
        System.out.println("Id: " + contato.getKey() + " - " + "Nome: " + contato.getValue().getNome() + " - " + "Número: " + contato.getValue().getNumero());
     }

     //Ordem natural numero - Criando classe normal -----
     System.out.println("-- Ordem natural numero --");
     /*Set<Map.Entry<Integer, Contato>> meusContatos5 = new TreeSet<>(new ComparatorNumero()){{
      addAll(meusContatos4);
     }};

     for(Map.Entry<Integer, Contato> contato : meusContatos5){
      System.out.println("Id: " + contato.getKey() + " - " + "Nome: " + contato.getValue().getNome() + " - " + "Número: " + contato.getValue().getNumero());
     } */

     //Ordem natural criado classe anonima ----
    /*  Set<Map.Entry<Integer, Contato>> meusContatos6 = new TreeSet<>(new Comparator<Map.Entry<Integer, Contato>>(){

      @Override
      public int compare(Map.Entry<Integer, Contato> c1, Map.Entry<Integer, Contato> c2) {
         return Integer.compare(c1.getValue().getNumero(), c2.getValue().getNumero());
      }
     });

     meusContatos6.addAll(meusContatos3.entrySet());

     for(Map.Entry<Integer, Contato> contato : meusContatos6){
      System.out.println("Id: " + contato.getKey() + " - " + "Nome: " + contato.getValue().getNome() + " - " + "Número: " + contato.getValue().getNumero());
     } */

     //Ordem natural numero criado com function------
     /*Set<Map.Entry<Integer, Contato>> meusContatos7 = new TreeSet<>(Comparator.comparing( //O método comparing precisa de uma function para se usar
      new Function<Map.Entry<Integer, Contato>, Integer>(){ //Criação da interface Function
         @Override
         public Integer apply (Map.Entry<Integer, Contato> contato){
            return contato.getValue().getNumero(); //O método apply pega os numeros dos contatos e compara, depois devolve o valor deles
         }
      }));

      meusContatos7.addAll(meusContatos4);
      for(Map.Entry<Integer, Contato> contato : meusContatos7){
         System.out.println("Id: " + contato.getKey() + " - " + "Nome: " + contato.getValue().getNome() + " - " + "Número: " + contato.getValue().getNumero());
        } */

        //Ordem natural numero com lambda
        Set<Map.Entry<Integer, Contato>> meusContatos8 = new TreeSet(Comparator.comparing(
         (contato) -> ((Entry<Integer, Contato>) contato).getValue().getNumero()));

         meusContatos8.addAll(meusContatos4);

         for(Map.Entry<Integer, Contato> contato : meusContatos8){
            System.out.println("Id: " + contato.getKey() + " - " + "Nome: " + contato.getValue().getNome() + " - " + "Número: " + contato.getValue().getNumero());
           }

      //Ordem do nome com lambda
      System.out.println("-- Ordem nome --");
      Set<Map.Entry<Integer, Contato>> meusContatos9 = new TreeSet<>(Comparator.comparing(
         cont -> cont.getValue().getNome()));

         meusContatos9.addAll(meusContatos4);

         for(Map.Entry<Integer, Contato> contato : meusContatos9){
            System.out.println("Id: " + contato.getKey() + " - " + "Nome: " + contato.getValue().getNome() + " - " + "Número: " + contato.getValue().getNumero());
           }
   }
}

class ComparatorNome implements Comparator<Map.Entry<Integer, Contato>>{

   @Override
   public int compare(Entry<Integer, Contato> c1, Entry<Integer, Contato> c2) {
      return c1.getValue().getNome().compareTo(c2.getValue().getNome());
   }

}

/*class ComparatorNumero implements Comparator<Map.Entry<Integer, Contato>>{

   @Override
   public int compare(Entry<Integer, Contato> c1, Entry<Integer, Contato> c2) {
      return Integer.compare(c1.getValue().getNumero(), c2.getValue().getNumero());
   }
   
}*/