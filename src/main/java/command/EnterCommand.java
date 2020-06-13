package command;

public class EnterCommand implements Command<Editor> {
	public void execute(Editor receiver) {
		System.out.println("Enter: " + receiver.getField());
	}
}
