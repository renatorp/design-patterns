package decorator;

public class ComponenteVisualWrapper extends ComponenteVisual{
	private ComponenteVisual componenteVisual;
	
	public ComponenteVisualWrapper(ComponenteVisual componenteVisual) {
		this.componenteVisual = componenteVisual;
	}
	
	@Override
	public String desenhar() {
		return componenteVisual.desenhar();
	}
}
