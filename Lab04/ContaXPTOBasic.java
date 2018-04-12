class ContaXPTOBasic extends Conta { // Polimorfismo de inclusão

	ContaXPTOBasic(String id) {
		super(id);
	}

	public void creditar(double qtd) {
		saldo = saldo + qtd;
	}

	public void debitar(double qtd) {
		saldo = saldo - qtd;
	}


	
}