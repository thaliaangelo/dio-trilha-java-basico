package exercicio3;

public class Main {
    public static void main(String[] args){
        Vendedor vendedor = new Vendedor();

        Funcionario funcionario = new Vendedor();
        
        vendedor.setNome("Thalia");
        System.out.println(vendedor.getNome());
    }
}
