package decorator;

public class Teste {

	public static void main(String[] args) {
		ComponenteVisual componente = new Scroll(new Borda(new CampoTexto(), 3));
		System.out.println(componente.desenhar());
	}

}
