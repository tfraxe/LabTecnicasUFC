class Main {
	public static void main(String[] args) {
		Expression op1, op2, op3, op4, op5;

		op1 = new Operando(5);
		op2 = new Operando(10);
		op3 = new Divisao();
		op4 = new Operando(23045);
		op5 = new Multiplicacao();

		op3.add(op2, op1);
		op5.add(op4, op3);

		System.out.println(op5.calcular());
	}
}