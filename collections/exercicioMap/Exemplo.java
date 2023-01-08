package exercicioMap;
import java.util.*;

public class Exemplo {
    public static void main(String[] args){

        /*
         * modelo: gol, consumo: 14,4
         * modelo: uno, consumo: 15,6
         * modelo: mobi, consumo: 16,1
         * modelo: hb20, consumo: 14,5
         * modelo: kwidi, consumo: 15,6
         */

         //Crie um dicionario que relacione os modelos com seus respectivos consumos

         Map<String, Double> carros = new HashMap<>();
         carros.put("Gol", 14.4);
         carros.put("Uno", 15.6);
         carros.put("Mobi", 16.1);
         carros.put("Hb20", 14.5);
         carros.put("Kwidi", 15.6);

         System.out.println(carros);
         System.out.println();

         //Substitua o consumo do gol por 15,2
         carros.put("Gol", 15.2);

         System.out.println(carros);
         System.out.println();

         //Confira se o modelo tucson está no dicionário
         System.out.println("O modelo Tucson está no dicionário? " + carros.containsKey("Tucson"));
         
         //Exiba o consumo do Uno
         System.out.println("Consumo do Uno: " + carros.get("Uno"));

         //Exiba os modelos
         Set<String> carro = carros.keySet(); //Quando usado o keySet() ele retorna todas as chaves em um tipo Set, pode usar uma variável para acessar todos os elementos do set
         System.out.println(carro); //O keySet trabalha com as chaves separadamente dos valores
         System.out.println();

         //Exiba o consumo dos carros
         Collection<Double> consumo = carros.values(); //Da mesma forma que o keySet retorna as chaves, o values() retorna os valores de cada chave
         System.out.println(consumo);
         System.out.println();

         //Exiba o modelo mais economico e seu consumo
        Double maisEficiente = Collections.max(carros.values()); //A variavel maisEficiente recebe o maior numero dos valores das chaves
        String carroConsumoMaior = ""; //Variável de controle, que vai receber a chave do maior consumo

        Set<Map.Entry<String, Double>> entries = carros.entrySet(); //Criação do set que vai percorrer todas as chaves e valores do Map carros

        for (Map.Entry<String, Double> consumoMaior: entries){ //Ele percorre todos os elementos do Set
            if(consumoMaior.getValue().equals(maisEficiente)){ //Pega o valor do elemento que está e compara para ver se é igual ao maior valor que existe no Set
                carroConsumoMaior = consumoMaior.getKey(); //Se for o maior valor, ele vai guardar a chave que está armazenado esse valor
                System.out.println("Mais eficiente: " + carroConsumoMaior + " - " + maisEficiente);
            }
        }

        //Exiba o modelo menos economico e seu consumo
        Double menosEficiente = Collections.min(carros.values());
        String carroConsumoMenor = "";

        for(Map.Entry<String, Double> consumoMenor : entries){
            if (consumoMenor.getValue().equals(menosEficiente)){
                carroConsumoMenor = consumoMenor.getKey();
                System.out.println("Menos eficiente: " + carroConsumoMenor + " - " + menosEficiente);
            }
        }

        //Exiba a soma dos consumos
        Double soma = 0.0;
        Iterator<Double> it = carros.values().iterator();
        while(it.hasNext()){
            soma += it.next();
        }
        System.out.println("Soma dos consumos: " + soma);
        System.out.println();

        //Exibir a média do consumo
        System.out.println("Média dos consumos: " + soma/carros.size());
        System.out.println();

        //Remover os carros com consumo igual a 15,6
        Iterator<Double> it2 = carros.values().iterator();
        while(it2.hasNext()){
            if (it2.next().equals(15.6)){
                it2.remove();
            }
        }
        System.out.println(carros);
        System.out.println();

        //Exiba o dicionário ordenado pelo modelo
        Map<String, Double> carros2 = new TreeMap<>();

        carros2.put("Gol", 14.4);
        carros2.put("Uno", 15.6);
        carros2.put("Mobi", 16.1);
        carros2.put("Hb20", 14.5);
        carros2.put("Kwidi", 15.6);
        System.out.println(carros2);

        //Apague o conjunto de carros
        carros.clear();

        //Verifique se o dicionario está vazio
        System.out.println("O dicionário está vazio? " + carros.isEmpty());
    }
}
