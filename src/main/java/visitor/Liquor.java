package visitor;

public class Liquor implements TaxVisitable {
	private double price;

	public Liquor(double price) {
		this.price = price;
	}

	public double getPrice() {
		return price;
	}

	public double accept(TaxVisitor visitor) {
		return visitor.visit(this);
	}
}
