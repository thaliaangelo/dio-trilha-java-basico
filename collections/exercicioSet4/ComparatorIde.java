package exercicioSet4;
import java.util.*;

public class ComparatorIde implements Comparator<LinguagemFavorita>{

    @Override
    public int compare(LinguagemFavorita  l1, LinguagemFavorita l2) {
        return l1.getIde().compareTo(l2.getIde());
    };
    
}
