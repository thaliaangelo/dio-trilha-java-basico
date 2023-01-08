package calculo.Area;

public class Main {
    
    public static void main(String[] args){

        CalculoArea q1 = new CalculoArea();
        CalculoArea r1 = new CalculoArea();
        CalculoArea t1 = new CalculoArea();

        System.out.println("Area quadrado: " + q1.calcularArea(5));
        System.out.println("Area retangulo: " + r1.calcularArea(10, 5));
        System.out.println("Area trapézio: " + t1.calcularArea(4, 12, 8));

    }
}
