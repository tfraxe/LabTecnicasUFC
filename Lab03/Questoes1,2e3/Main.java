class Main {
	
	public static void main(String[] args) {
		Figura circ = new Circulo(0, 0, 5);
		Figura circ2 = new Circulo(15, 27, 30);
		
		Figura quadrado = new Quadrado(31, 45, 80);
		Figura quadrado2 = new Quadrado(71, 64, 7);
		
		circ.desenhar();
		circ2.desenhar();
		quadrado.desenhar();
		quadrado2.desenhar();

		System.out.println("Área do quadrado 1: " + quadrado.calcularArea());
		System.out.println("Área do quadrado 2: " + quadrado2.calcularArea());
		System.out.println("Área do circulo 1: " + circ.calcularArea());
		System.out.println("Área do circulo 2: " + circ2.calcularArea());

		
	}

}