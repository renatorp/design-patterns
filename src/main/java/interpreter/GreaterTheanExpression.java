package interpreter;

public class GreaterTheanExpression implements BooleanExpression {
	private final NumberExpression expr1;
	private final NumberExpression expr2;

	public GreaterTheanExpression(NumberExpression expr1, NumberExpression expr2) {
		this.expr1 = expr1;
		this.expr2 = expr2;
	}

	public Boolean evaluate() {
		return expr1.evaluate() > expr2.evaluate();
	}
}
