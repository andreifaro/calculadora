package impostos;

public interface Imposto {

    // Em interfaces não definimos propriedades (caracteristicas)

    // Só podemos definir ações (metodos)
    public double calcular();

    public double getValor();

    public void setValor(double valor);

    public void setAliquota(double aliquota);
}