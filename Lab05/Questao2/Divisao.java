class Divisao extends OperadorBinario {
	Divisao(Expression xp1, Expression xp2) {
		super(xp1, xp2);
	}

	double calcular() {
		return exp1.calcular() / exp2.calcular();
	}
}