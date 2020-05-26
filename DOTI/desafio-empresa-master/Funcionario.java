public class Funcionario extends Pessoa {

    private double salario;
    private String matricula;

	//public void setAdmitido(String admitido) {
      //  this.admitido = admitido;
    //}
    //public String getAdmitido() {
      //  return admitido;
    //}
    /**
     * @return the salario
     */
    public double getSalario() {
        return salario;
    }

    /**
     * @param salario the salario to set
     */
    public void setSalario(double salario) {
        this.salario = salario;
    }

    /**
     * @return the matricula
     */
    public String getMatricula() {
        return matricula;
    }

    /**
     * @param matricula the matricula to set
     */
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

	public void imprimirResumoFunc() {
        System.out.println(".........................................");
        System.out.println("Nome: " + getNome());
        System.out.println("Matricula: " + matricula);
        System.out.println("Endereço: " + getEndereco());
        System.out.println("Salario: " + salario);
        System.out.println(".........................................");
    }
    public void imprimirResumopessoa() {
        System.out.println(".........................................");
        System.out.println("Nome: " + getNome());
        System.out.println("Endereço: " + getEndereco());
        System.out.println("CPF: " + getCPF());
        System.out.println(".........................................");
    }
}
