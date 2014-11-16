package composite;

public class Linha extends GraphicComponent {

	private Integer tamanho;

	public Linha(Integer tamanho) {
		this.tamanho = tamanho;
	}
	
	public Integer getTamanho() {
		return tamanho;
	}
	
	@Override
	String desenhar() {
		String resultado = "";
		int tamanho = this.tamanho;
		
		while (tamanho > 0) {
			resultado += "-";
			tamanho--;
		}
		return resultado + "\n";
	}

	@Override
	String getId() {
		return tamanho.toString();
	}

}
