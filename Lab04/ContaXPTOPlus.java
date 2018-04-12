class ContaXPTOPlus extends Conta { //Polimorfismo de inclusão

	ContaXPTOPlus(String id) {
		super(id);
	}

	public void creditar(double qtd) {
		saldo = saldo + (qtd*1.005);
	}

	public void debitar(double qtd) {
		saldo = saldo - qtd;
	}

}