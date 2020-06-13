package chainofresponsability;

public class Button extends Widget {
	
	public Button(HelpHandler handler) {
		super(handler);
	}

	@Override
	public String handleHelp() {
		return "Ajuda do botão!!";
	}
}
