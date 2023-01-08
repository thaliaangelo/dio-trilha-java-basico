package exercicio3;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Iterator;

public class Exercicio {
    
    public static void main(String[] args){

        /*
         * Faça um programa que receba a temperatura média dos 6
        primeiros meses do ano e armazene-as em uma lista.

        Após isto, calcule a média semestral das temperaturas e
        mostre todas as temperaturas acima desta média, e em que
        mês elas ocorreram (mostrar o mês por extenso: 1 – Janeiro, 2
        – Fevereiro e etc).
         */

        List<Double> temperaturas = new ArrayList<>(6);
        temperaturas.add(21.0);
        temperaturas.add(25.3);
        temperaturas.add(30.1);
        temperaturas.add(19.4);
        temperaturas.add(25.0);
        temperaturas.add(28.8);

        double soma = 0;
        Iterator<Double> it = temperaturas.iterator();
        while(it.hasNext()){
            Double next = it.next();
            soma += next;
        }

        Double media = soma/temperaturas.size();

        int count = 0;
        Iterator<Double> it2 = temperaturas.iterator();
        
        while(it2.hasNext()){
                temperaturas.indexOf(count); //está no indice do contador, no começo está no indice 0
                Double temp = it2.next();
                if (temp > media){
                   switch(count){
                    case (0) : System.out.println("1-Janeiro " + temp);
                    break;

                    case (1) : System.out.println("2-Fevereiro " + temp);
                    break;

                    case (2) : System.out.println("3-Março " + temp);
                    break;

                    case (3) : System.out.println("4-Abril " + temp);
                    break;

                    case(4) : System.out.println("5-Maio " + temp);
                    break;

                    default : System.out.println("6-Junho " + temp);
                   }
            }
            count++;
        }
    }
}
//O contador ia passando mesmo que a temperatura fosse menor que a média, assim entrando no indice respectivo da temperatura.
