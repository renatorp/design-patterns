package interpreter;

public interface Expression<T> {
	<T> T evaluate();
}
