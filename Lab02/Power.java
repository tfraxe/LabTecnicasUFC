class Power extends Conjunto {

	Power(String nome, int tamanho) {
		super(nome, tamanho);
	}
	void printElementos() {
		
		System.out.println(this.nome);
		System.out.print("{ ");
		for (int i = 0; i < this.tamanho; i++) {
			Conjunto elemento = (Conjunto) elementos[i];
			System.out.print("{");
			for (int j = 0; j < elemento.tamanho; j++) {
				if(elemento.temElemento(elemento.elementos[j]))
					System.out.print(elemento.elementos[j] + ", ");
				
			}
			if(i != 0)
				System.out.print("\b\b");
			System.out.print("}, ");

		}
		System.out.print("\b\b");
		System.out.println("}");
	}
}