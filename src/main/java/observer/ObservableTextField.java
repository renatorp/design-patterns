package observer;

import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.HashSet;
import java.util.Set;

public class ObservableTextField extends JTextField implements Subject<String> {
	private Set<Observer> observers = new HashSet<Observer>();

	public ObservableTextField() {
		this.addKeyListener(new KeyListener() {

			public void keyTyped(KeyEvent e) {
			}

			public void keyPressed(KeyEvent e) {
			}

			public void keyReleased(KeyEvent e) {
				publish();
			}
		});
	}

	public void subscribe(Observer observer) {
		observers.add(observer);
	}

	public void unsubscribe(Observer observer) {
		observers.remove(observer);
	}

	public void publish() {
		for (Observer o : observers) {
			o.update(this.getText());
		}
	}

}
