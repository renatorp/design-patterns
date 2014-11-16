package strategy;

public class OperacaoSubtracao implements Operacao {

	@Override
	public int calcular(int x, int y) {
		return x - y;
	}

}
