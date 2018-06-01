class Main {
	public static void main(String[] args) {
		Expression op1, op2, op3, op4, op5;

		op1 = new Operando(5);
		op2 = new Operando(-10);
		op3 = new Divisao();
		op4 = new Operando(-23045);
		op5 = new Multiplicacao();

		Observer obs1 = new ObservadorPositivo(op5);
		Observer obs2 =  new ObservadorNegativo(op5);

		op5.subscrever(obs1);
		op5.subscrever(obs2);

		op3.add(op2, op1);
		op5.add(op4, op3);

		op5.setEstado(0);
		System.out.println(op5.calcular());


	}
}