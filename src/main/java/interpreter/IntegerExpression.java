package interpreter;

public class IntegerExpression implements NumberExpression {
	private final Integer number;

	public IntegerExpression(Integer number) {
		this.number = number;
	}

	public Integer evaluate() {
		return number;
	}
}
