import java.util.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProgramaEmpresa {
    static List<Empresa> listaempresa = new ArrayList<Empresa>();
    static List<Funcionario> listafuncionario = new ArrayList<Funcionario>();
    static List<Carro> listacarro = new ArrayList<Carro>();
    static List<Pessoa> listapessoas = new ArrayList<Pessoa>();
    static List<Funcionario> listafuncionarioAdmitido = new ArrayList<Funcionario>();

    public static void main(String[] args) throws Exception {
        Scanner leitor = new Scanner(System.in);
        int opcao;
        double emptemp;
        String nomeempresa = "";

        do {
            menuprincipal();
            opcao = leitor.nextInt();

            switch (opcao) {
                case 1:
                    cadastroempresa();
                    break;
                case 2:
                    cadastrafunc();
                    break;
                case 3:
                System.out.println("Digite o codigo da empresa");
                emptemp = leitor.nextDouble();
                    if (validaempresa(emptemp, nomeempresa) == true){
                        nomeempresa = informaempresa(emptemp);
                        contrata(emptemp, nomeempresa);
                }else
                System.out.println("nao validou ou nao igual");
                    ;
                    break;
                case 4:
                System.out.println("Digite o codigo da empresa");
                emptemp = leitor.nextDouble();
                if (validaempresa(emptemp, nomeempresa) == true){
                    demite();
                    }else
                    System.out.println("nao validou ou nao igual");
                    break;
                case 5:
                    listarempresas();
                    break;
                case 6:
                    listarfuncionarios();
                    break;

                default:
                    break;
            }
        } while (opcao != 0);
    }


    private static void contrata(Double empresa, String nomeempresa) {
    Scanner leitor = new Scanner(System.in);
    float temp2;
    String temp;
    float salario;   
    System.out.println("Digite o CPF do contratado");
    temp2 = leitor.nextFloat();
    for (int contador = 1; contador < listafuncionario.size(); contador++) {
        Funcionario elemento = listafuncionario.get(contador-1);
            if (temp2 == elemento.getCPF())
            {
                System.out.println("Digite o Salario: ");
                salario = leitor.nextFloat();
                elemento.setSalario(salario);
                System.out.println("Digite a Matricula:");
                temp = leitor.next();
                elemento.setMatricula(temp);
                elemento.setEmpresacontrata(nomeempresa);
            }
            else{
                System.out.println("Pessoa nao existe");
            }
    }}

    private static void demite() {
        Scanner leitor = new Scanner(System.in);
        int temp2;
        System.out.println("Digite o CPF do Demitido");
        temp2 = leitor.nextInt();
        for (int contador = 1; contador < listafuncionario.size(); contador++) {
            Funcionario elemento = listafuncionario.get(contador-1);
                if (temp2 == elemento.getCPF())
                {
                    elemento.setSalario(0);
                    elemento.setMatricula(null);
                    elemento.setEmpresacontrata(null);
                }
                else{
                    System.out.println("Pessoa nao existe");
                }
        }}

    private static void listarfuncionarios() {
        for (int contador = 1; contador < listafuncionario.size(); contador++) {
            Funcionario elemento = listafuncionario.get(contador-1);
            System.out.println("---- Dados das pessoas ----");
            System.out.println("Nome: "+ elemento.getNome());
            System.out.println("CPF : "+ elemento.getCPF());
            System.out.println("Endereço: "+ elemento.getEndereco());
            if (elemento.getMatricula()!= null) 
            {
            System.out.println("Status da Pessoa: Empregado");
            System.out.println("Matricula: "+ elemento.getMatricula());
            System.out.println("Contratante: "+ elemento.getEmpresacontrata());
            }
            else{
            System.out.println("Status da Pessoa: Desempregado");
            }
            System.out.println("Salario: "+ elemento.getSalario());
            System.out.println(""+ elemento.getCadastrocarro());
        }
    }

    private static void cadastroempresa() {
        Empresa empresatemp = new Empresa();
        Scanner leitor = new Scanner(System.in);
        String temp;
        float fat;
        Integer codigotemp;
        System.out.println("Opcao Cadastro Empresa");
        System.out.println("Dgite o Nome da Sua Empresa: ");
        temp = leitor.nextLine();
        empresatemp.setNome(temp);
        System.out.println("Digite o Endereço: ");
        temp = leitor.nextLine();
        empresatemp.setEndereco(temp);
        System.out.println("Digite o CNPJ xx.xxx.xx/xxxx-xx:");
        temp = leitor.nextLine();
        empresatemp.setCnpj(temp);
        System.out.println("Faturamento no valor de: ");
        fat = leitor.nextFloat();
        empresatemp.setFaturamento(fat);
        System.out.println("Digite o Codigo da Empresa :");
        codigotemp = leitor.nextInt();
        empresatemp.setCod(codigotemp);
        empresatemp.setDataFundacao(new Date());
        System.out.println("\n Resumo da Nova Empresa: ");
        empresatemp.imprimirResumo();
        listaempresa.add(empresatemp);

    }

    private static void cadastrafunc() {
    Funcionario functemp = new Funcionario(); 
    Scanner leitor = new Scanner(System.in);
    String temp;
    String temcarro;
    double valortemp;
    int cpftemp;
    int anotemp;
    System.out.println("Opcao Cadastro Funcionario");
    System.out.println("Dgite o Nome do Funcionario: ");
        temp = leitor.nextLine();
        functemp.setNome(temp);
    System.out.println("Digite o Endereço: ");
        temp = leitor.nextLine();
        functemp.setEndereco(temp);
    System.out.println("Digite o CPF:");
        cpftemp = leitor.nextInt();
        functemp.setCPF(cpftemp);
    System.out.println("A pessoa possui carro? 1-Sim/2-Nao");
        temcarro = leitor.next();
        switch (temcarro){
            case "1":
            Carro carrotemp = new Carro();
            System.out.println("Digite o Modelo: ");
                temp = leitor.next();
                carrotemp.setModelo(temp);
                functemp.setCadastrocarro("Tem Carro - "+ temp);
            System.out.println("Digite o Ano do carro: ");
                anotemp = leitor.nextInt();
                carrotemp.setAno(anotemp);
            System.out.println("Digite a placa do carro: ");        
                temp = leitor.next();
                carrotemp.setPlaca(temp);

            System.out.println("Digite o Valor do Carro: ");   
                valortemp = leitor.nextInt();
                carrotemp.setValor(valortemp);
                listacarro.add(carrotemp);
                listafuncionario.add(functemp);
                adicionarCarro(carrotemp, functemp);
                Pessoa pessoatemp = (Pessoa) functemp;
                listapessoas.add(pessoatemp);
            break;
            case "2":
                listafuncionario.add(functemp);
            break;
            default :
            System.out.println("Opcao Invalida");
            break;
            }
    System.out.println("\nResumo da Nova Pessoa: ");
        listafuncionario.add(functemp);
        functemp.imprimirResumopessoa();
    }

    public static boolean validaempresa(double emptemp, String nomeempresa) {
        double valida;
        boolean ok = false;

        for (int contador = 0; contador < listaempresa.size() && ok==false ; contador++) {
            Empresa elemento = listaempresa.get(contador);
            valida = elemento.getCOD();
            if ( valida == emptemp)
            {
                System.out.println("Empresa existe");
                ok = true;
                nomeempresa = elemento.getNome();
            }
            else{
            System.out.println("Empresa nao existe");
            ok = false;
            }
        }
return ok;
    }

    public static String informaempresa(double emptemp) {
        double valida;
        boolean ok = false;
        String passaempresa=null;

        for (int contador = 0; contador < listaempresa.size(); contador++) {
            Empresa elemento = listaempresa.get(contador);
            valida = elemento.getCOD();
            if ( valida == emptemp)
            {
                passaempresa = elemento.getNome();
            }
            else{
            System.out.println("Empresa nao existe");
            }
        }
        return passaempresa;
    }

    public static void listarempresas(){
        for (int contador = 0; contador < listaempresa.size(); contador++) {
            Empresa elemento = listaempresa.get(contador);
            System.out.println("---- Dados das Empresas ----");
            System.out.println("Nome: " + elemento.getNome());
            System.out.println("Codigo Empresa :" + elemento.getCOD());
            System.out.println("Endereço: " + elemento.getEndereco());
            System.out.println("CNPJ: " + elemento.getCnpj());
            System.out.println("Faturamento: " + elemento.getFaturamento());
            System.out.println("Fundação :" + elemento.getFundacao());
        }
    }

    public static void adicionarCarro(Carro carro, Pessoa pessoa) {
        pessoa.setCarro(carro);
    }

    public static void menuprincipal() {
        System.out.println("\n\n----BEM VINDO----");
        System.out.println("1- Criar Empresa");
        System.out.println("2- Criar Pessoa");
        System.out.println("3- Contratar Pessoa");
        System.out.println("4- Convidar a sair");
        System.out.println("5- Listar Empresas");
        System.out.println("6- Listar Funcionarios");
        System.out.println("0- Sair do programa");
        }
}