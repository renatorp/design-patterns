package strategy;

public class CalculoContext {

	private Operacao operacao;
	
	public CalculoContext(Operacao operacao) {
		this.operacao = operacao;
	}
	
	public int executarCalculo(int x, int y) {
		return operacao.calcular(x, y);
	}
	
}
