class Main {

public static void main(String[] args) {
	Sistema s = new Sistema();
	s.criarContaXPTOBasic("1");
	s.criarContaXPTOPlus("2");
	s.criarContaXPTOExtreme("3");

	s.creditar("1", 1000); //Coerção de int para double
	s.creditar("2", 1000); //Coerção de int para double
	s.creditar("3", 1000); //Coerção de int para double
	s.debitar("1", 10); //Coerção de int para double
	s.debitar("2", 10); //Coerção de int para double
	s.debitar("3",  10); //Coerção de int para double

	System.out.println("Saldo 1: " + s.consultarSaldo("1"));
	System.out.println("Saldo 2: " + s.consultarSaldo("2"));
	System.out.println("Saldo 3: " + s.consultarSaldo("3"));

	
	}
}

