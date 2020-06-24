package command;

public class Client {

	public static void main(String[] args) {
		Editor editor = new Editor();
		editor.executeCommand(new TypeCommand("T"));
		editor.executeCommand(new TypeCommand("e"));
		editor.executeCommand(new TypeCommand("s"));
		editor.executeCommand(new TypeCommand("a"));
		editor.executeCommand(new BackspaceCommand());
		editor.executeCommand(new TypeCommand("t"));
		editor.executeCommand(new CutCommand());
		editor.executeCommand(new EnterCommand());
		editor.executeCommand(new PasteCommand());
		editor.executeCommand(new EnterCommand());
	}
}
