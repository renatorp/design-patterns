package command;

public class PasteCommand implements Command<Editor> {
	public void execute(Editor receiver) {
		receiver.setField(receiver.getClipboard());
	}
}
