import java.util.Scanner;
public class primeiroprograma3 {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		String imposto;
		double percent;
		double valorsubmetido;
		double resultado;
			System.out.print("Informe o imposto : ");
				imposto = leitor.nextLine();
			System.out.print("Informe o percent : ");
				percent = leitor.nextDouble();
			System.out.print("Informe o valor submetido : ");
				valorsubmetido = leitor.nextDouble();
		resultado = (valorsubmetido*percent)/100;
		leitor.close();
	System.out.println(" \nO valor a ser pago de imposto de " +imposto +" sera de: R$" + resultado) ;
	}
}