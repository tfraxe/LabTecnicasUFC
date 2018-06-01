class Operando extends Expression {
	double valor;

	Operando(double v) {
		valor = v;
	}

	double calcular() {
		return valor;
	}

	void setValor(double v) {
		valor = v;
	}
}