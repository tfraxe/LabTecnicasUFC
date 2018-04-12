public abstract class Conta {
	double saldo;
	String id;
	
	Conta(String id) {
		this.id = id;
		saldo = 0;
	}
	
	public abstract void creditar(double qtd);
	public abstract void debitar(double qtd);
	
	public double consultarSaldo() {
		return saldo;
	}

	public String toString() {
		return ("Id: " + this.id + " Saldo: " + this.saldo + "  Tipo: " + this.getClass().getName());
	}

}