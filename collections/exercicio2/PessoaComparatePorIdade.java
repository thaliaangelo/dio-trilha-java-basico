package exercicio2;
import java.util.Comparator;

public class PessoaComparatePorIdade implements Comparator<Pessoa> {

    @Override
    public int compare(Pessoa p1, Pessoa p2) {
        return p1.getIdade() - p2.getIdade();
    }
    
}
