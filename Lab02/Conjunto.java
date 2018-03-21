class Conjunto  {

	String nome;
	int tamanho;
	Object elementos[];
	int posOcupadas[];

	Conjunto(String nome, int tamanho) {
		this.nome = nome;
		this.elementos = new Object[tamanho];
		this.posOcupadas = new int[tamanho];
		this.tamanho = tamanho; 
	}

	void inserirElemento(Object elemento) {
		if(!this.temElemento(elemento)) {

			for (int i = 0; i < tamanho ; i++ ) {
				if (posOcupadas[i] == 0) {
					elementos[i] = elemento;
					posOcupadas[i] = 1;
					return;
				}
				
			}
	}

		System.out.println("Não foi possível adicionar o elemento " + elemento);
	}


	void printElementos() {
		System.out.println("Elementos do conjunto "+this.nome + ":");
		System.out.print("{");
		for (int i = 0; i < tamanho ; i++ ) {
			if(this.temElemento(elementos[i]))
				System.out.print(elementos[i]+" ");
		} 
		System.out.println("}");
	}

	boolean temElemento(Object elemento) {
		for (int i = 0; i < tamanho ; i++ ) {
			if(elementos[i] == elemento && posOcupadas[i] == 1) {
				return true;
			}
		}

		return false;
	}

	boolean isSubconjuntoDe(Conjunto c) {
		for(int i = 0; i < this.tamanho; i++) {
			if(!c.temElemento(this.elementos[i])) {
				return false;
			}
		}

		return true;
	}

	Conjunto uniao(Conjunto c) {
		int novoTamanho = this.tamanho + c.tamanho;
		for(int i = 0; i < this.tamanho; i++) {
			if(c.temElemento(this.elementos[i])) {
				novoTamanho--;
			}
		}

		Conjunto unido = new Conjunto(this.nome + " união "+c.nome, novoTamanho);
		
		for(int i = 0; i < this.tamanho; i++) {
			unido.inserirElemento(this.elementos[i]);
		}

		for(int i = 0; i < c.tamanho; i++) {
			unido.inserirElemento(c.elementos[i]);
		}		

		return unido;
	}


	Conjunto intersec(Conjunto c) {
		int novoTamanho = 0;
		for(int i = 0; i < this.tamanho; i++) {
			if(c.temElemento(this.elementos[i])) {
				novoTamanho++;
			}
		}

		Conjunto inters = new Conjunto(this.nome + " x "+c.nome, novoTamanho);
		for(int i = 0; i < this.tamanho; i++) {
			if(c.temElemento(this.elementos[i])) {
				inters.inserirElemento(this.elementos[i]);
			}
		}		

		return inters;
	}

	Conjunto diferenca(Conjunto c) {
		int novoTamanho = 0;
		for(int i = 0; i < this.tamanho; i++) {
			if(!c.temElemento(this.elementos[i])) {
				novoTamanho++;
			}
		}

		Conjunto difer = new Conjunto(this.nome + " menos "+c.nome, novoTamanho);
		for(int i = 0; i < this.tamanho; i++) {
			if(!c.temElemento(this.elementos[i])) {
				difer.inserirElemento(this.elementos[i]);
			}
		}		

		return difer;	
	}

	Power powerSet() {
		int novoTamanho = 1;
		for (int i = 0; i < this.tamanho; i++)
			novoTamanho = novoTamanho * 2;
		Power power = new Power("Conjunto das partes do conjunto " + this.nome, novoTamanho);

		int pos = 0;
		int numero = 0;
		for(int j = 0; j < novoTamanho; j++) {
			Conjunto aux = new Conjunto("", this.tamanho);
			numero = j;
			while (numero != 0) {
				if((numero & 1) == 1)
					aux.inserirElemento(this.elementos[pos]);
				pos++;
				numero = numero >> 1;
			}

			pos = 0;
			power.inserirElemento(aux);

		}

		return power;
	}

	ProdutoCartesiano cartesiano(Conjunto c) {

		int novoTamanho = this.tamanho * c.tamanho;
		ProdutoCartesiano cartesian = new ProdutoCartesiano(this.nome+" cartesiano "+c.nome, novoTamanho);
		for (int i = 0; i < this.tamanho; i++) {
			for (int j = 0; j < c.tamanho; j++) {
				ParOrdenado elemento = new ParOrdenado(this.elementos[i], c.elementos[j]);
				cartesian.inserirElemento(elemento);

			}
		}

		return cartesian;
	}

	public static void main(String[] args) {
		// ---- 2ª questão, conjunto 1 -------
		Conjunto dezPrimeirosNaturais = new Conjunto("dez Naturais", 10);
		for(int i = 0; i < 10; i++)
			dezPrimeirosNaturais.inserirElemento(i);

		System.out.println("Segunda questão, item a: ");
		dezPrimeirosNaturais.printElementos();

		// -------------------------------------
		
		// ---- 2ª questão, conjunto 2 ---------
		Conjunto cincoPrimeirosPares = new Conjunto("cinco Pares", 5);

		for (int i = 0; i < 10; i++)
			if(i % 2 == 0)
				cincoPrimeirosPares.inserirElemento(i);

		System.out.println("Segunda questão, conjunto 2: ");
		cincoPrimeirosPares.printElementos();


		// --------------------------------------


		// ----------------- 2ª questão, conjunto 3 -------------------------
		Conjunto cincoPrimeirosImpares = new Conjunto("cinco Impares", 5);
		for (int i = 0; i < 10; i++)
			if(i % 2 != 0)
				cincoPrimeirosImpares.inserirElemento(i);

			
		System.out.println("Segunda questão, conjunto 3: ");
		cincoPrimeirosImpares.printElementos();
		
		// ---------------------------------------------------------------

		
		// --------------- 2ª questão, conjunto 4 --------------
		Conjunto dezPrimeirosPrimos = new Conjunto("dez Primos", 10);

		dezPrimeirosPrimos.inserirElemento(2);
		dezPrimeirosPrimos.inserirElemento(3);
		dezPrimeirosPrimos.inserirElemento(5);
		dezPrimeirosPrimos.inserirElemento(7);
		dezPrimeirosPrimos.inserirElemento(11);
		dezPrimeirosPrimos.inserirElemento(13);
		dezPrimeirosPrimos.inserirElemento(17);
		dezPrimeirosPrimos.inserirElemento(19);
		dezPrimeirosPrimos.inserirElemento(23);
		dezPrimeirosPrimos.inserirElemento(29);
		System.out.println("Segunda questão, conjunto 4: ");
		dezPrimeirosPrimos.printElementos();

		// -------------------------------------------------------



		// ---------------- 2ª questão, item a -------------------------
		System.out.println("\n\n");
		System.out.println("Segunda questão, item a. Serve também para a terceira e a quarta questões:: ");
		if(dezPrimeirosPrimos.isSubconjuntoDe(dezPrimeirosPrimos))
			System.out.println("O conjunto 4 é subconjunto de si mesmo");
		else
			System.out.println("O conjunto 4 não é subconjunto de si mesmo");

		//---------------------------------------------------------------

		
		// ----------------- 2ª questão, item b------------------------------------------------------------------------------------------------
		System.out.println("\n\n");
		System.out.println("Segunda questão, item b. Serve também para terceira e quarta questões: ");
		if(cincoPrimeirosPares.isSubconjuntoDe(dezPrimeirosNaturais)) System.out.println("Cinco primeiros pares é subconjunto dos diz primeiros naturais");
		if(cincoPrimeirosImpares.isSubconjuntoDe(dezPrimeirosNaturais)) System.out.println("Cinco primeiros impares é subconjunto dos dez primeiros naturais: ");
		if(dezPrimeirosPrimos.isSubconjuntoDe(dezPrimeirosNaturais)) 
			System.out.println("Dez primeiros primos é subconjunto dos dez primeiros naturais: ");
		else
			System.out.println("Dez primeiros primos não é subconjunto dos dez primeiros naturais"); 

		// ------------------------------------------------------------------------------------------------------------------------------------

		// --------------- 2ª questão, item c -----------------------------
		System.out.println("\n\n");
		System.out.println("Segunda questão, item c. Serve também para a terceira e a quarta questões:: ");
		Conjunto naturais = cincoPrimeirosImpares.uniao(cincoPrimeirosPares);
		naturais.printElementos();
		if(naturais.isSubconjuntoDe(dezPrimeirosNaturais) && dezPrimeirosNaturais.isSubconjuntoDe(naturais))
			System.out.println("Os conjuntos 2 união 3 e o conjunto 1 são iguais");
		else
			System.out.println("Os conjuntos 2 união 3 e o conjunto 1 são diferentes");
		//-----------------------------------------------------------------

		
		// --------------- 2ª questão, item d ------------------------------
		System.out.println("\n\n");
		System.out.println("Segunda questão, item d. Serve também para a terceira e a quarta questões: ");
		Conjunto d = dezPrimeirosNaturais.intersec(cincoPrimeirosPares);
		d.printElementos();
		if(d.tamanho == 0)
			System.out.println("A intersecção dos conjuntos 1 e 2 é vazia");
		else
			System.out.println("A intersecção dos conjuntos 1 e 2 não é vazia");
		// ------------------------------------------------------------------
		
		// --------------- 2ª questão, item e -------------------------------
		System.out.println("\n\n");
		System.out.println("Segunda questão, item e. Serve também para a terceira e a quarta questões:: ");
		Conjunto e = dezPrimeirosNaturais.diferenca(cincoPrimeirosPares);
		e.printElementos();
		//-------------------------------------------------------------------

		
		// ---------------- 4ª questão, teste do método Conjunto Potência ---------
		System.out.println("\n\n");
		System.out.println("");
		Power powerPares = cincoPrimeirosPares.powerSet();

		powerPares.printElementos();

		// ------------------------------------------------------------------------

		
		// ---------------- 4ª questão, teste do método Produto Cartesiano -----------
		System.out.println("\n\n");
		ProdutoCartesiano teste = cincoPrimeirosImpares.cartesiano(dezPrimeirosPrimos);
		teste.printElementos();
		//------------------------------------------------------------------------------
		

		// --------------- 5ª questão ---------------------------------------------------
		System.out.println("\n\n");
		System.out.println("Quinta questão: ");

		//Conjunto universo
		Conjunto f = new Conjunto("Cinquenta primeiro inteiros", 50);
		for(int i = 0; i < 50; i++)
			f.inserirElemento(i);

		Conjunto f1 = f.diferenca(cincoPrimeirosPares.uniao(dezPrimeirosPrimos));
		Conjunto f2 = f.diferenca(cincoPrimeirosPares).intersec(f.diferenca(dezPrimeirosPrimos));
		f1.printElementos();
		f2.printElementos();

		Conjunto f3 = f.diferenca(cincoPrimeirosPares.intersec(dezPrimeirosPrimos));
		Conjunto f4 = f.diferenca(cincoPrimeirosPares).uniao(f.diferenca(dezPrimeirosPrimos));
		f3.printElementos();
		f4.printElementos();



	}
	
}



//Lembrar de adicionar: imprimir apenas os elementos que são realmente elementos.
//Isto é, elementos que estão ocupando uma posição (posição com valor 1 no vetor)
 

 //Algumas modelagens possíveis para resolver os outros problemas da lista:
	//Criar classe 'par ordenado'
	//Criar classe 'power set' (Esta estou achando necessária apenas pra imprimir direitinho os elementos na tela)
	//Podemos usar a superclasse Object para modelar atributos polimórficos.


/*
	Para criar o conjunto do produto cartesiano, vamos fazer assim:
	1) Primeiro, vamos definir a classe PAR ORDENADO. 
	2) Segundo, esta classe contará com dois elementos, que chamarei x e y
	3) O elemento x será um elemento do conjunto A e o elemento y será um elemento do conjunto B
	4) Para cada elemento de A, para cada elemento de B, criaremos um par ordenado, e então o inserimos como elemento do conjunto
	5) No arquivo principal, só precisamos alterar a definição do tipo elementos para ser do tipo Object.
	6) Pronto, está feito.

	Para criar o conjunto das partes de A, vamos fazer assim:
	1) Primeiro, vamos criar uma classe específica para o conjunto potência
	2) Segundo, os elementos dessa classe serão objetos da classe Conjunto
	3) Para obter os elementos, vamos fazer assim:
		Se o conjunto A tem n elementos, então o conjunto das partes tem 2^n elementos. 
		Então vamos fazer um laço de 1 -> 2^n - 1, e, para cada iteração do laço, faremos divisiões sucessivas por dois, até chegar a 0. 
		Em cada divisão vamos incrementar um contador em 1. Se o resto da divisão for 1, acessaremos o vetor de elementos na posição em que está o contador. 
		O elemento será então incluído no conjunto. Quando a divisão enfim chegar a 0, todos os elementos já terão sido incluídos no subconjunto, e ele poderá ser incluído no conjunto potência.

		Este algoritmo parece muito custoso. Mas acredito que não dá pra ser de outra maneira. 
		Vamos precisar, independente do algortimo, de 2^n elementos. 

		Mas sei lá... do jeito que estou fazendo, o algoritmo ficará com complexidade pelo menos exponencial.. 

		Será algo do tipo (2^n) * lg i. Isso é muito ruim. Mas é uma solução. 
		É uma solução simples de implementar, mas muito custosa. Será que não consigo pensar numa maneira mais eficiente? 


 */