package impostos;

public class IRRF implements Imposto {

    private double valor;
    private double aliquota = 0.275;

    @Override
    public double calcular() {
        return this.valor * aliquota;
    }

    @Override
    public double getValor() {
        return this.valor;
    }

    @Override
    public void setValor(double valor) {
        this.valor = valor;

    }

    @Override
    public void setAliquota(double aliquota) {
        this.aliquota = aliquota;

    }

}