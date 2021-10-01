package atp17;

public class CalculadoraImpostos {
    private double iss = 0.15;
    private double iof = 0.05;
    private double ir = 0.1;

    public double calculaISS(double valor) {
        return valor * iss;
    }

    public double calculaIOF(double valor) {
        return valor * iof;
    }

    public double calculaIR(double valor) {
        return valor * ir;
    }
}
