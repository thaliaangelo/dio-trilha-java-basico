package exercicioSet4;
import java.util.*;

public class ComparatorAnoCriacaoNome implements Comparator<LinguagemFavorita>{

    @Override
    public int compare(LinguagemFavorita l1, LinguagemFavorita l2) {
        int nome = l1.getNome().compareTo(l2.getNome());
        if (nome != 0){
            return nome;
        }
        return Integer.compare(l1.getAnoCriacao(), l2.getAnoCriacao());
    }
    
}