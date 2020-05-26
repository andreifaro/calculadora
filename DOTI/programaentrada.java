import java.util.Scanner;
public class programaentrada {
	public static int entrada() {
		Scanner leitor = new Scanner(System.in);
		int valor;
				System.out.print("Informe o Valor : ");
					valor = leitor.nextInt();
					return valor;
		}
		
	}