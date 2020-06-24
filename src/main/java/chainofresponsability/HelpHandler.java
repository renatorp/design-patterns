package chainofresponsability;

public abstract class HelpHandler {

	private HelpHandler sucessor;
	
	public HelpHandler() {
		this(null);
	}
	
	public HelpHandler(HelpHandler handler) {
		sucessor = handler;
	}
	
	public String handleHelp() {
		if (sucessor != null) {
			return sucessor.handleHelp();
		}
		return null;
	}

}
