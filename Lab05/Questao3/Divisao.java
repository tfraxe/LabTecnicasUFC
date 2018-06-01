class Divisao extends Operador {
	double calcular() {
		double resultado = esq.calcular() / dir.calcular();
		if (resultado <= 0)
			this.setEstado(0);
		else
			this.setEstado(1);
		return resultado;
	}
}