package command;

public class CutCommand implements Command<Editor> {
	public void execute(Editor receiver) {
		receiver.setClipboard(receiver.getField());
		receiver.setField("");
	}
}
