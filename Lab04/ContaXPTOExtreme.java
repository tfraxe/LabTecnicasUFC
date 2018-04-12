class ContaXPTOExtreme extends Conta { //Polimorfismo de inclusão
	
	ContaXPTOExtreme(String id) {
		super(id);
	}

	public void creditar(double qtd) {
		saldo = saldo + (qtd*1.002);
	}

	public void debitar(double qtd) {
		saldo = saldo - (qtd*0.998);
	}


}