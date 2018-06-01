class ObservadorPositivo extends Observer {
	ObservadorPositivo(Expression sub) {
		super(sub);
	}
	void update() {
		if(subject.getEstado() == 1)
			System.out.println("Resultado deu positivo!");
		return;
	}
}