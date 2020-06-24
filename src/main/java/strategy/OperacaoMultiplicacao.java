package strategy;

public class OperacaoMultiplicacao implements Operacao {

	@Override
	public int calcular(int x, int y) {
		return x * y;
	}

}
