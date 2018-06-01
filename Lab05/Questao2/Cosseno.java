import java.lang.Math;

class Cosseno extends OperadorUnario {
	Cosseno(Expression xp) {
		super(xp);
	}

	double calcular() {
		return Math.cos(exp1.calcular());
	}
}