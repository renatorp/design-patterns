package strategy;

public class Cliente {

	public static void main(String[] args) {
		CalculoContext contexto1 = new CalculoContext(new OperacaoAdicao());
		System.out.println(contexto1.executarCalculo(3, 2));
		
		CalculoContext contexto2 = new CalculoContext(new OperacaoSubtracao());
		System.out.println(contexto2.executarCalculo(3, 2));
		
		CalculoContext contexto3 = new CalculoContext(new OperacaoMultiplicacao());
		System.out.println(contexto3.executarCalculo(3, 2));
	}

}
