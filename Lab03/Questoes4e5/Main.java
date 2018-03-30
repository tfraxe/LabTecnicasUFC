class Main {
	
	public static void main(String[] args) {
		Figura[] figuras = new Figura[10];

		figuras[0] = new Circulo(0, 0, 10);
		figuras[1] = new Circulo(0, 71, 10);
		figuras[2] = new Quadrado(53, 21, 37);
		figuras[3] = new Quadrado(41, 42, 6);
		figuras[4] = new Quadrado(31, 31, 10);
		figuras[5] = new Circulo(1, 3, 5);
		figuras[6] = new Quadrado(3, 4, 5);
		figuras[7] = new Circulo(1, 200, 25);
		figuras[8] = new Quadrado(34, 67, 234);
		figuras[9] = new Quadrado(40, 17, 13);

		for (int i = 0; i < 10; i++) 
			if(figuras[i] instanceof Colorida)
				System.out.println("Área de " + figuras[i] + ": " +figuras[i].calcularArea());
	}

}