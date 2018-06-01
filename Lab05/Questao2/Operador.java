public abstract class Operador extends Expression {
	Expression exp1, exp2;

	Operador(Expression xp1, Expression xp2) {
		exp1 = xp1;
		exp2 = xp2;
	}
}