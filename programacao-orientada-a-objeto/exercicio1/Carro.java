package exercicio1;

class Carro{

    String cor;
    String modelo;
    int capacidadeTanque;

    Carro(){

    }

    Carro(String cor, String modelo, int capacidadeTanque){
        this.cor = cor;
        this.modelo = modelo;
        this.capacidadeTanque = capacidadeTanque;
    }

    public void setCapacidadeTanque(int capacidadeTanque){
        this.capacidadeTanque = capacidadeTanque;
    }

    public void setCor(String cor){
        this.cor = cor;
    }

    public void setModelo(String modelo){
        this.modelo = modelo;
    }

    public String getCor(){
        return cor;
    }

    public String getModelo(){
        return modelo;
    }

    public int getCapacidadeTanque(){
        return capacidadeTanque;
    }

    public double encherTanque(double valorGasolina){
        return valorGasolina * capacidadeTanque;
    }
}