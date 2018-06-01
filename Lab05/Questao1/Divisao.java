class Divisao extends Operador {
	double calcular() {
		return esq.calcular() / dir.calcular();
	}
}