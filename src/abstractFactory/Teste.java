package abstractFactory;

public class Teste {

	public static void main(String[] args) {
		
		String lookAndFeel = "Motif";
		
		LookAndFeelFactory factory = createLookAndFeelFactory(lookAndFeel);

		Button botao = factory.createButtom();
		EditBox editBox = factory.createEditBox();
		
		botao.draw();
		editBox.draw();
	}

	private static LookAndFeelFactory createLookAndFeelFactory(String lookAndFeel) {

		if (lookAndFeel.equals("Windows")) {
			return new WindowsLookAndFeelFactory();
			
		} else if (lookAndFeel.equals("Motif")){
			return new MotifLookAndFeelFactory();
			
		} else {
			throw new RuntimeException("Tipo não definido ou iválido");
		}
	}

}
