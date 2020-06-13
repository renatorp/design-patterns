package command;

public class Editor implements Receiver {
	private String clipboard;
	private String field = "";

	public String getClipboard() {
		return clipboard;
	}

	public void setClipboard(String clipboard) {
		this.clipboard = clipboard;
	}

	public String getField() {
		return field;
	}

	public void setField(String field) {
		this.field = field;
	}

	public void executeCommand(Command<Editor> command) {
		command.execute(this);
	}
}
