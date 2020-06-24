package visitor;

public class TaxCalculator implements TaxVisitor {
	public double visit(Tobacco visitable) {
		return visitable.getPrice() * .32 + visitable.getPrice();
	}

	public double visit(Necessity visitable) {
		return visitable.getPrice();
	}

	public double visit(Liquor visitable) {
		return visitable.getPrice() * .18 + visitable.getPrice();
	}
}
