class Circulo extends Figura  {
	int centroX;
	int centroY;
	int raio;

	Circulo(int x, int y, int r) {
		centroX = x;
		centroY = y;
		raio = r;
	}

	public float calcularArea() {
		return (3.14F * raio * raio);
	}

	public void desenhar() {
		System.out.println(this);
	}

	public void mover(float dx, float dy) {
		centroX += dx;
		centroY += dy;
	}

}