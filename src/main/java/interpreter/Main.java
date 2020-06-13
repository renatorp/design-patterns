package interpreter;

public class Main {
	public static void main(String[] args) {
		NumberExpression number1 = new IntegerExpression(1);
		NumberExpression number2 = new IntegerExpression(2);
		NumberExpression sum = new SumExpression(number1, number2);
		Expression greaterThen = new GreaterTheanExpression(sum, new IntegerExpression(0));

		System.out.println(greaterThen.evaluate());
	}
}
