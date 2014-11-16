package decorator;

public class Scroll extends ComponenteVisualWrapper {

	public Scroll(ComponenteVisual componenteVisual) {
		super(componenteVisual);
	}

	@Override
	public String desenhar() {
		String resultado = "";
		
		resultado += "COMEÇA SCROLL\n";
		resultado += super.desenhar() + "\n";
		resultado += "TERMINA SCROLL\n";
		
		return resultado;
	}
}
