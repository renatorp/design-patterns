package command;

public class BackspaceCommand implements Command<Editor> {
	public void execute(Editor receiver) {
		receiver.setField(receiver.getField().substring(0, receiver.getField().length()-1));
	}
}
