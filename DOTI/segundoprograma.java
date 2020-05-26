public class segundoprograma {
	public static void main(final String[] args) {

		final int valA = programaentrada.entrada();
		final int valB = programaentrada.entrada();
		final int valC = programasoma.soma(valA, valB);
		final int valD = programasubtracao.subtracao(valA, valB);
		final int valE = programamultiplica.multiplicacao(valA, valB);
		final double valF = programadivisao.divisao(valA, valB);

		System.out.println("O valor da Soma foi: " + valC);
		System.out.println("O valor da Subtracao foi: " + valD);
		System.out.println("O valor da Multiplicacao foi: " + valE);
		System.out.println("O valor da Divisao foi: " + valF);
	}
}

