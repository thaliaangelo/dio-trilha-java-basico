package exemploQueue;
import java.util.Queue;
import java.util.LinkedList;

public class Banco {
    public static void main(String[] args){

        Queue<String> filaBanco = new LinkedList<>();
        
        //Adicione elementos na fila e navegue imprimindo eles no console
        filaBanco.add("Juliana");
        filaBanco.add("Pedro");
        filaBanco.add("Carlos");
        filaBanco.add("Larissa");
        filaBanco.add("João");

        for(String client : filaBanco){
            System.out.println("Fila: " + "---> " +  client);
        }

        //Retorne o primeiro item da fila sem remove-lo
        System.out.println(filaBanco.peek());
        System.out.println(filaBanco);

        //Retorne o primeiro item da lista removendo ele
        System.out.println(filaBanco.poll());
        System.out.println(filaBanco);

        //Adicione um nome e veja a posição dele
        filaBanco.add("Daniel");
        System.out.println(filaBanco);

        //Retorne o tamanho da fila
        System.out.println(filaBanco.size());

        //Verifique se a fila está vazia
        System.out.println(filaBanco.isEmpty());

        //Verifique se o nome Carlos está na fila
        System.out.println(filaBanco.contains("Carlos"));
        
    }
}
