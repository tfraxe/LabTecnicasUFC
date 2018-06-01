import java.util.LinkedList;
abstract class Expression {
	LinkedList <Observer> observadores = new LinkedList<Observer>();
	int estado;

	void notificar() {
		if(!observadores.isEmpty())
			for(Observer observador : observadores)
				observador.update();
		return;
	}

	void subscrever(Observer observador) {
		observadores.add(observador);
	}

	void desinscrever(Observer observador) {
		observadores.remove(observador);
	}

	int getEstado() {
		return estado;
	}

	void setEstado(int state) {
		estado = state;
		this.notificar();
	}
	
	abstract double calcular();
	void add(Expression esq, Expression dir) {}
}