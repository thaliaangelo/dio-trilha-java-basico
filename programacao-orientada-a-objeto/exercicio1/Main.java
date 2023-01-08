package exercicio1;

public class Main {
    
    public static void main(String[] args){

        Carro c1 = new Carro();

        c1.setCapacidadeTanque(40);
        c1.setCor("Preto");
        c1.setModelo("Uno");
        
        System.out.println("Cor: " + c1.getCor());
        System.out.println("Modelo: " + c1.getModelo());
        System.out.println("Valor para encher o tanque: " + c1.encherTanque(5.3));

        System.out.println();

        Carro c2 = new Carro("Vermelho", "BMW", 50);

        System.out.println("Cor: " + c2.getCor());
        System.out.println("Modelo: " + c2.getModelo());
        System.out.println("Valor para encher o tanque: " + c2.encherTanque(5.3));

    }
}
