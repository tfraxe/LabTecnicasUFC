abstract class Operador extends Expression {
	Expression esq, dir;

	void add(Expression esq, Expression dir) {
		this.esq = esq;
		this.dir = dir;
	}
}