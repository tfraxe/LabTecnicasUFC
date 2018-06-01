import java.lang.Math;

class Seno extends OperadorUnario {
	Seno(Expression xp) {
		super(xp);
	}

	double calcular() {
		return Math.sin(exp1.calcular());
	}
}