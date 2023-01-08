package exercicio;

public class Pessoa implements Comparable<Pessoa> {
    
    private String nome;
    private int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }


    public int compareTo(Pessoa outraPessoa) {
        return this.getNome().compareToIgnoreCase(outraPessoa.getNome());
    }

    /* @Override
     public int compareTo(Pessoa outraPessoa) { //Método para comparar as idades e colocar do menor para o maior
        return this.getIdade() - outraPessoa.getIdade();
    } */

     /*@Override
    public String toString() { //Método para transformar o endereço de memória em String
        return "Pessoa [idade=" + idade + "]";
    } */

    public String toString() { // Método para comparar e colocar em ordem alfabética
        return "Pessoa [Nome=" + nome + "]";
    }

    

    

}
