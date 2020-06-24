package visitor;

public class Tobacco implements TaxVisitable {
	private double price;

	public Tobacco(double price) {
		this.price = price;
	}

	public double getPrice() {
		return price;
	}

	public double accept(TaxVisitor visitor) {
		return visitor.visit(this);
	}
}
