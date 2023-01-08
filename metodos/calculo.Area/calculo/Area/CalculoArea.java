package calculo.Area;

public class CalculoArea{

    /*
     * criar uma aplicação que calcula a area dos 3 quadriláteros notaveis: 
     * quadrado, retangulo, trapezio.
     */

    //Calculo area quadrado
     public static double calcularArea(double lado){ 
        return lado * lado;
     }


    //Calculo area retangulo
     public static double calcularArea(double largura, double comprimento){
        return largura * comprimento;
     }

     public static double calcularArea(double altura, double baseMaior, double baseMenor){
        return ((baseMaior + baseMenor) * altura) / 2;
     }

}