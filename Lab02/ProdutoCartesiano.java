class ProdutoCartesiano extends Conjunto {
	ProdutoCartesiano(String nome, int tamanho) {
		super(nome, tamanho);
	}

	void printElementos() {
		
		System.out.println(this.nome);
		System.out.print("{ ");
		for (int i = 0; i < this.tamanho; i++) {
			ParOrdenado elemento = (ParOrdenado) elementos[i];
			elemento.print();
			System.out.print(", ");
		}

		System.out.print("\b\b");
		System.out.println("}");

	}
}
