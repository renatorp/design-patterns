package observer;

import java.util.HashSet;
import java.util.Set;

public class ObservableProperty implements Subject {
	private Set<Observer> observers = new HashSet<Observer>();
	private String property;

	public void subscribe(Observer observer) {
		observers.add(observer);
	}

	public void unsubscribe(Observer observer) {
		observers.remove(observer);
	}

	public void publish() {
		for (Observer o : observers) {
			o.update(this.property);
		}
	}

	public String getProperty() {
		return property;
	}

	public void setProperty(String property) {
		this.property = property;
		this.publish();
	}
}
