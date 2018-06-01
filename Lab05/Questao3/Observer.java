abstract class Observer {
	Expression subject;
	Observer(Expression sub) {
		subject = sub;
	}

	abstract void update();
}