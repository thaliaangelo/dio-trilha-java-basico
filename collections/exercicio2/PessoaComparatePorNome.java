package exercicio2;

import java.util.Comparator;

public class PessoaComparatePorNome implements Comparator<Pessoa>{

    @Override
    public int compare(Pessoa p1, Pessoa p2) { //Está comparando dois objetos do tipo Pessoa
        return p1.getNome().compareTo(p2.getNome());
    }
    
}
