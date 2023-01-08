package ordenacaoMap;
import java.util.*;
import java.util.Map.Entry;

public class ComparatorNumeroPaginas implements Comparator<Map.Entry<String, Livro>>{

    @Override
    public int compare(Entry<String, Livro> l1, Entry<String, Livro> l2) {
        return Integer.compare(l1.getValue().getNumeroPaginas(), l2.getValue().getNumeroPaginas());
    }
    
}
