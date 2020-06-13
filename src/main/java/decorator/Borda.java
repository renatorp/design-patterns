package decorator;

public class Borda extends ComponenteVisualWrapper {

	private int expessura;
	
	public Borda(ComponenteVisual conteudo, int expessura) {
		super(conteudo);
		this.expessura = expessura;
	}

	public int getExpessura() {
		return expessura;
	}

	@Override
	public String desenhar() {
		String borda = "";
		String resultado = "";
		
		for (int i = 0; i < expessura; i++) {
			borda += "-----------------\n";
		}
		
		resultado += borda;
		resultado +=  super.desenhar() + "\n";
		resultado += borda;
		
		return resultado;
	}
}
