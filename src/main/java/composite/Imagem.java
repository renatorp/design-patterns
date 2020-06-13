package composite;

public class Imagem extends GraphicComponent{

	@Override
	public String desenhar() {
		String resultado = "";
		for (GraphicComponent grafico : graficos) {
			resultado += grafico.desenhar();
		}
		return resultado;
	}

	@Override
	public String getId() {
		String id =  "";
		for (GraphicComponent grafico : graficos) {
			id += grafico.getId();
		}
		return id;
	}

}
