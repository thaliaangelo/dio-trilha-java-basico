package ordenacaoMap;
import java.util.*;
import java.util.Map.Entry;
public class ComparatorNome  implements Comparator<Map.Entry<String, Livro>> {

    @Override
    public int compare(Entry<String, Livro> l1, Entry<String, Livro> l2) {
        return l1.getValue().getNome().compareToIgnoreCase(l2.getValue().getNome());
    }
    
}
