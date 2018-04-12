class Sistema {
	Conta[] contas;

	Sistema() {
		contas = new Conta[10];
	}

	void criarContaXPTOBasic(String id) {
		for(int i = 0; i < contas.length; i++) 
			if(contas[i] != null && contas[i].id == id) {
				System.out.println("Erro! Já existe uma conta com esse id!");
				return;
			}
		for(int i = 0; i < contas.length; i++) 
			if(contas[i] == null) {
				contas[i] = new ContaXPTOBasic(id);
				return;
			}
	}

	void criarContaXPTOPlus(String id) {
		for(int i = 0; i < contas.length; i++) 
			if(contas[i] != null && contas[i].id == id) {
				System.out.println("Erro! Já existe uma conta com esse id!");
				return;
			}
		for(int i = 0; i < contas.length; i++) 
			if(contas[i] == null) {
				contas[i] = new ContaXPTOPlus(id);
				return;
			}
	}

	void criarContaXPTOExtreme(String id) {
		for(int i = 0; i < contas.length; i++) 
			if(contas[i] != null && contas[i].id == id) {
				System.out.println("Erro! Já existe uma conta com esse id!");
				return;
			}
		for(int i = 0; i < contas.length; i++) 
			if(contas[i] == null) {
				contas[i] = new ContaXPTOExtreme(id);
				return;
			}
	}

	void debitar(String id, double qtd) { 
		for(int i = 0; i < contas.length; i++) 
			if(contas[i] != null && contas[i].id == id)
				contas[i].debitar(qtd); //Late binding
		
	}
	void creditar(String id, double qtd) {
		for(int i = 0; i < contas.length; i++) 
			if(contas[i] != null && contas[i].id == id)
				contas[i].creditar(qtd); //Late binding
		
	}

	double consultarSaldo(String id) {
		for(int i = 0; i < contas.length; i++) 
			if(contas[i] != null && contas[i].id == id)
				return contas[i].consultarSaldo(); //Late binding
		return 0;
	}

}