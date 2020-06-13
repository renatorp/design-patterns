package chainofresponsability;

public class Cliente {

	public static void main(String[] args) {
		Application app = new Application();
		Widget dialogo = new Widget(app);
		Button botao = new Button(dialogo);
		
		System.out.println(botao.handleHelp());
		System.out.println(dialogo.handleHelp());
		System.out.println(app.handleHelp());
	}

}
