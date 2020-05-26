import java.util.Date;

public class Pessoa {

    private String nome;
    private String endereco;
    private String telefone;
    private Date nascimento;
    private String cadastrocarro;
    private int CPF;
    private String Empresacontrata;

    // Composição de objetos
    private Carro carro;

	/**
     * @return the carro
     */
    public Carro getCarro() {
        return carro;
    }

    /**
     * @param carro the carro to set
     */
    public void setCarro(Carro carro) {
        this.carro = carro;
    }

    /**
     * @return the endereco
     */
    public String getEndereco() {
        return endereco;
    }

    /**
     * @param endereco the endereco to set
     */
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    /**
     * @return the nascimento
     */
    public Date getNascimento() {
        return nascimento;
    }

    /**
     * @param nascimento the nascimento to set
     */
    public void setNascimento(Date nascimento) {
        this.nascimento = nascimento;
    }

    public void setCadastrocarro(String cadastrocarro) {
        this.cadastrocarro = cadastrocarro;
    }

    public String getCadastrocarro() {
        return cadastrocarro;
    }

    public void setCPF(int cpf) {
        this.CPF = cpf;
   }

    public int getCPF() {
        return CPF;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmpresacontrata() {
        return Empresacontrata;
    }

    public void setEmpresacontrata(String Empresacontrata) {
        this.Empresacontrata = Empresacontrata;
    }

}