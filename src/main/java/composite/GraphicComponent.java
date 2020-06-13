package composite;

import java.util.ArrayList;
import java.util.List;

public abstract class GraphicComponent {
	
	protected List<GraphicComponent> graficos;
	
	public GraphicComponent() {
		graficos = new ArrayList<GraphicComponent>();
	}
	
	abstract String desenhar();
	
	abstract String getId();
	
	public void adicionarGrafico(GraphicComponent grafico) {
		graficos.add(grafico);
	}
	
	public void removerGrafico(GraphicComponent grafico) {
		graficos.remove(grafico);
	}
	
	public GraphicComponent getGrafico(int i){
		if (graficos.size() > i) {
			return graficos.get(i);
		}
		return null;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof GraphicComponent) {
			return ((GraphicComponent)obj).getId().equals(this.getId());
		}
		return false;
	}
	
}
