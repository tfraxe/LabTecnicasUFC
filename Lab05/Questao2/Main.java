class Main {
	public static void main(String[] args) {
		Expression minhaExpressao, minhaExpressao2;

		minhaExpressao = new Cosseno(new Subtracao(new Divisao(new Multiplicacao(new Operando(5), new Operando(10)), new Operando(2)), new Operando(25)));

		minhaExpressao2 = new Operando(0);

		minhaExpressao2 = new Seno(minhaExpressao2);


		System.out.println(minhaExpressao.calcular());

		System.out.println(minhaExpressao2.calcular());
	}
}