package composite;

public class Texto extends GraphicComponent {

	private String texto;
	
	public Texto(String texto) {
		this.texto = texto;
	}
	
	@Override
	String desenhar() {
		return texto;
	}

	@Override
	String getId() {
		return texto;
	}

}
