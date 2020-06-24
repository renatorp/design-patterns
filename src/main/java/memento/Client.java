package memento;


import java.util.Stack;

public class Client {
	public static void main(String[] args) {
		final Editor editor = new Editor();

		final Stack<Memento> stack = new Stack<Memento>();

		editor.setOnBeforeReshape(new Runnable() {
			public void run() {
				stack.push(editor.createSnapshot());
			}
		});

		editor.setOnUndo(new Runnable() {
			public void run() {
				stack.pop().restore();
			}
		});


		editor.setVisible(true);
	}
}
