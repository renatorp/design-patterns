package visitor;

public class Necessity implements TaxVisitable {
	private double price;

	public Necessity(double price) {
		this.price = price;
	}

	public double getPrice() {
		return price;
	}

	public double accept(TaxVisitor visitor) {
		return visitor.visit(this);
	}
}
