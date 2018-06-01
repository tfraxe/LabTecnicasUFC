class ObservadorNegativo extends Observer {
	ObservadorNegativo(Expression sub) {
		super(sub);
	}

	void update() {
		if(subject.getEstado() == 0)
			System.out.println("Resultado deu zero ou negativo!");
		return;
	}
}