package observer;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
	public static void main(String[] args) {

		final Editor editor = new Editor();
		final ObservableProperty p = new ObservableProperty();

		Observer<String> textFieldObserver = new Observer<String>() {
			public void update(String state) {
				p.setProperty(state);
			}
		};
		editor.getTextField1().subscribe(textFieldObserver);
		editor.getTextField2().subscribe(textFieldObserver);
		editor.getTextField3().subscribe(textFieldObserver);

		final Observer<String> propertyObserver = new Observer<String>() {
			public void update(String value) {
				editor.getTextField1().setText(value);
				editor.getTextField2().setText(value);
				editor.getTextField3().setText(value);
			}
		};
		p.subscribe(propertyObserver);

		editor.getButton().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				p.unsubscribe(propertyObserver);
			}
		});

		editor.setVisible(true);
	}
}
