package strategy;

public class OperacaoAdicao implements Operacao {

	@Override
	public int calcular(int x, int y) {
		return x + y;
	}

}
