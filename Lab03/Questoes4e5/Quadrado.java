class Quadrado extends Figura implements Colorida  {
	int cantoEsquerdoX;
	int cantoEsquerdoY;
	int lado;

	Quadrado(int x, int y, int l) {
		cantoEsquerdoX = x;
		cantoEsquerdoY = y;
		lado = l;
	}

	public float calcularArea() {
		return (lado * lado);
	}

	public void desenhar() {
		System.out.println(this);
	}

	public void mover(float dx, float dy) {
		cantoEsquerdoX += dx;
		cantoEsquerdoY += dy;
	}

	public void desenhar(String cor) {
		System.out.println(this + " foi pintado na cor " + cor);
	}
}