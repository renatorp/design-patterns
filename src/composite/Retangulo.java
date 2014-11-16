package composite;

public class Retangulo extends GraphicComponent {

	private Integer altura;
	
	public Retangulo(Integer altura, Linha linha) {
		this.altura = altura;
		this.adicionarGrafico(linha);
	}
	
	@Override
	String desenhar() {
		String resultado = "";
		Linha linha = (Linha)getGrafico(0);
		int altura = this.altura;
		
		resultado += linha.desenhar();
		
		while (altura > 0) {
			resultado += "|";
			for (int i = 0; i < linha.getTamanho(); i++) {
				resultado += " ";
			}
			resultado += "|\n";
			altura--;
		}
		resultado += linha.desenhar() + "\n";
		
		return resultado;
	}

	@Override
	String getId() {
		return altura + getGrafico(0).getId();
	}

}
