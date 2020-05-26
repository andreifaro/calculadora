import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import impostos.ICMS;
import impostos.Imposto;

public class Empresa {

    private String nome;
    private String cnpj;
    private String endereco;
    private Date fundacao;
    private float faturamento;
    private int codigo;

    List<Funcionario> listaFuncionarios = new ArrayList<Funcionario>();

    Imposto icms;
    Imposto ipi;

    /**
     * Metodo responsavel por exibir dados da empresa
     */
    public void imprimirResumo() {
        System.out.println(".........................................");
        System.out.println("Nome: " + nome);
        System.out.println("CNPJ: " + cnpj);
        System.out.println("Endereço: " + endereco);
        System.out.println("Data Fundação: " + fundacao);
        System.out.println("Faturamento: " + faturamento);
        System.out.println(".........................................");
    }

    public String getNome() {
        return nome;
    }

    public void setCod(Integer codigo) {
        this.codigo = codigo;
    }

    public Integer getCOD() {
        return codigo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public Date getFundacao() {
        return fundacao;
    }

    public void setDataFundacao(Date dataFundacao) {
        this.fundacao = dataFundacao;
    }

    public float getFaturamento() {
        return faturamento;
    }

    public void setFaturamento(float faturamento) {
        this.faturamento = faturamento;
    }

    /**
     * @return the listaFuncionarios
     */
    public List<Funcionario> getListaFuncionarios() {
        return listaFuncionarios;
    }

    /**
     * @param listaFuncionarios the listaFuncionarios to set
     */
    public void setListaFuncionarios(List<Funcionario> listaFuncionarios) {
        this.listaFuncionarios = listaFuncionarios;
    }

    public Empresa() {
    }

    public Empresa(double faturamentoInicial) throws Exception {
        if (this.faturamento <= 0) {
            throw new Exception("Faturamento não pode ser igual a zero");
        }

        icms = new ICMS(this.faturamento);
    }

    public void contratacao(Funcionario novoFuncionario) {

        if (novoFuncionario instanceof Pessoa) {
            listaFuncionarios.add(novoFuncionario);
        } else {
            System.out.println("Tipo de Instancia Diferente");
        }

    }

    public void demissao(Funcionario funcionarioDemitido) {
        listaFuncionarios.remove(funcionarioDemitido);
    }

}