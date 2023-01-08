package exercicio5;

class Calculadora implements OperacaoMatematica {

    @Override
    public double soma(double n1, double n2) {
        // TODO Auto-generated method stub
        return n1 + n2;
    }

    @Override
    public double subtracao(double n1, double n2) {
        // TODO Auto-generated method stub
        return n1 - n2;
    }

    @Override
    public double multiplicacao(double n1, double n2) {
        // TODO Auto-generated method stub
        return n1 * n2;
    }

    @Override
    public double divisao(double n1, double n2) {
        // TODO Auto-generated method stub
        return n1 / n2;
    }
    
}
