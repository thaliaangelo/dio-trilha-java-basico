package exercicio2;
import java.util.Comparator;

public class PessoaComparateNomeIdade implements Comparator<Pessoa>{

    @Override
    public int compare(Pessoa p1, Pessoa p2) {
        int nome = p1.getNome().compareToIgnoreCase(p2.getNome());
        if (nome != 0) {
            return nome;
        }

       return p1.getIdade() - p2.getIdade();
    }
    
}
