package exercicioMap2;
import java.util.*;

public class Main {
    public static void main(String[] args){

        /*
         *  Estado = PE - População = 9.616.621
            Estado = AL - População = 3.351.543
            Estado = CE - População = 9.187.103
            Estado = RN - População = 3.534.265
         */
        //Crie um dicionário e relacione os estados e suas populações;
        Map<String, Integer> estados = new HashMap<>(){{
            put("PE", 9616621);
            put("AL", 3351543);
            put("CE", 9187103);
            put("RN", 3534265);    
        }};
        System.out.println(estados);
        System.out.println();

        //Substitua a população do estado do RN por 3.534.165;
        estados.put("RN", 3534165);
        System.out.println(estados);
        System.out.println();

        //Confira se o estado PB está no dicionário, caso não adicione: PB - 4.039.277;
        if (estados.containsKey("PB") != true){
            estados.put("PB", 4039277);
        }
        System.out.println(estados);
        System.out.println();

        //Exiba a população PE;
        System.out.println("População PE: " + estados.get("PE"));
        System.out.println();

        //Exiba todos os estados e suas populações na ordem que foi informado;
        Map<String, Integer> estados1 = new LinkedHashMap<>(){{
            put("PE", 9616621);
            put("AL", 3351543);
            put("CE", 9187103);
            put("RN", 3534265);  
            put("PB", 4039277);
        }};
        System.out.println(estados1);
        System.out.println();

        //Exiba os estados e suas populações em ordem alfabética;
        Map<String, Integer> estados2 = new TreeMap<>(estados1);
        System.out.println(estados2);
        System.out.println();

        //Exiba o estado com o menor população e sua quantidade;
        Integer menorPopulacao = Collections.min(estados1.values());
        String menorEstado = "";
        Set<Map.Entry<String, Integer>> estado = estados1.entrySet();

        for(Map.Entry<String, Integer> entrie : estado){
            if(entrie.getValue().equals(menorPopulacao)){
                menorEstado = entrie.getKey();
            }
        }
        System.out.println("Estado com menor população: " + menorEstado + " - " + menorPopulacao);
        System.out.println();

        //Exiba o estado com a maior população e sua quantidade;
        Integer maiorPopulacao = Collections.max(estados1.values());
        String maiorEstado = "";

        for(Map.Entry<String, Integer> entrie : estado){
            if(entrie.getValue().equals(maiorPopulacao)){
                maiorEstado = entrie.getKey();
            }
        }
        System.out.println("Estado com maior populaçao: " + maiorEstado + " - " + maiorPopulacao);
        System.out.println();

        //Exiba a soma da população desses estados;
        Integer soma = 0;
        Iterator<Integer> it = estados1.values().iterator();
        while(it.hasNext()){
            soma += it.next();
        }
        System.out.println("Soma da populaçao: " + soma);
        System.out.println();

        //Exiba a média da população deste dicionário de estados;
        System.out.println("Média: " + soma/estados1.size());
        System.out.println();

        //Remova os estados com a população menor que 4.000.000;
        Iterator<Integer> it1 = estados1.values().iterator();
        while(it1.hasNext()){
            if(it1.next() < 4000000){
                it1.remove();
            }
        }
        System.out.println(estados1);
        System.out.println();

        //Apague o dicionário de estados;
        estados1.clear();

        //Confira se o dicionário está vazio
        System.out.println("O dicionário está vazio? " + estados1.isEmpty());
    }
}
