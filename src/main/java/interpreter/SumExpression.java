package interpreter;

public class SumExpression implements NumberExpression {

	private final NumberExpression expression1;
	private final NumberExpression expression2;

	public SumExpression(NumberExpression number1, NumberExpression number2) {
		this.expression1 = number1;
		this.expression2 = number2;
	}

	public Integer evaluate() {
		return expression1.evaluate() + expression2.evaluate();
	}
}
