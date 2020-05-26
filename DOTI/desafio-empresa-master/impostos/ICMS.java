package impostos;

public class ICMS implements Imposto {

    private double valor;
    private double aliquota = 0.20;

    public ICMS(double valor) {
        this.valor = valor;
    }

    @Override
    public double calcular() {
        return this.valor * aliquota;

    }

    @Override
    public double getValor() {
        return valor;
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