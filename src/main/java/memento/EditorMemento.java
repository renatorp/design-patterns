package memento;

import java.awt.*;

public class EditorMemento implements Memento{
	private final Editor editor;
	private final Editor.EditorState state;


	public EditorMemento(Editor editor, Editor.EditorState state) {
		this.editor = editor;
		this.state = state;
	}

	public void restore() {
		editor.setState(state);
	}

}
