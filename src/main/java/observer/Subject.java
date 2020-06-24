package observer;

public interface Subject<T> {
	void subscribe(Observer<T> observer);
	void unsubscribe(Observer<T> observer);
	void publish();
}
