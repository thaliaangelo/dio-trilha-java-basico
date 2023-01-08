package exercicio2;

public class Veiculo {
    
    String cor;
    String modelo;
    int capacidadeTanque;

    void setCor(String cor){
        this.cor = cor;
    }

    void setModelo(String modelo){
        this.modelo = modelo;
    }

    void setCapacidadeTanque(int capacidadeTanque){
        this.capacidadeTanque = capacidadeTanque;
    }

    String getCor(){
        return cor;
    }

    String getModelo(){
        return modelo;
    }

    int getCapacidadeTanque(){
        return capacidadeTanque;
    }

    double encherTanque(double valorGasolina){
        return valorGasolina * capacidadeTanque;
    }
}
