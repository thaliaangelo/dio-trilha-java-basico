package exercicioSet4;

public class LinguagemFavorita implements Comparable<LinguagemFavorita>{
    private String nome;
    private String ide;
    private int anoCriacao;
    
    public LinguagemFavorita(String nome, String ide, int anoCriacao) {
        this.nome = nome;
        this.ide = ide;
        this.anoCriacao = anoCriacao;
    }
    
    public String getNome() {
        return nome;
    }
    public String getIde() {
        return ide;
    }
    public int getAnoCriacao() {
        return anoCriacao;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nome == null) ? 0 : nome.hashCode());
        result = prime * result + ((ide == null) ? 0 : ide.hashCode());
        result = prime * result + anoCriacao;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        LinguagemFavorita other = (LinguagemFavorita) obj;
        if (nome == null) {
            if (other.nome != null)
                return false;
        } else if (!nome.equals(other.nome))
            return false;
        if (ide == null) {
            if (other.ide != null)
                return false;
        } else if (!ide.equals(other.ide))
            return false;
        if (anoCriacao != other.anoCriacao)
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "[nome=" + nome + ", ide=" + ide + ", anoCriacao=" + anoCriacao + "]";
    }

    @Override
    public int compareTo(LinguagemFavorita linguagem) {
        return this.getNome().compareTo(linguagem.getNome());
    }
    
}
