class Carro {
	int ano;
	String cor;
	String modelo;
	String nome;
	int gasolina;
	Object idade;

	Carro(String nome, Object idade) {
		this.nome = nome;
		this.idade = idade;
	}

	int getAno() {
		return ano;
	}

	String getCor() {
		return cor;
	}

	String getModelo() {
		return modelo;
	}

	String getNome() {
		return nome;
	} 

	Object getIdade() {
		return idade;
	}

	int getGasolina() {
		return gasolina;
	}

	void setAno(int ano) {
		this.ano = ano;
	}

	void setCor(String cor) {
		this.cor = cor;
	}

	void setModelo(String modelo) {
		this.modelo = modelo;
	}

	void setNome(String nome) {
		this.nome = nome;
	}

	void setGasolina(int gasolina) {
		this.gasolina = gasolina;
	}

	public static void main(String[] args) {
		Carro novo;
		novo = new Carro("HB20", 20);

		Carro novo2;
		novo2 = new Carro("Ford KA", "40");


		System.out.println(novo.getNome() + " " + novo.getIdade());
		System.out.println(novo2.getNome() + " " + novo2.getIdade() + " " +  novo2.getIdade().getClass());

	}



}