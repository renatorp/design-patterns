package command;

public class TypeCommand implements Command<Editor> {
	private final String letter;

	public TypeCommand(String letter) {
		this.letter = letter;
	}

	public void execute(Editor editor) {
		editor.setField(editor.getField() + letter);
	}
}
