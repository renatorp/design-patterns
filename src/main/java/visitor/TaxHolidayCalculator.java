package visitor;

public class TaxHolidayCalculator implements TaxVisitor {
	public double visit(Tobacco visitable) {
		return visitable.getPrice() * .30 + visitable.getPrice();
	}

	public double visit(Necessity visitable) {
		return visitable.getPrice();
	}

	public double visit(Liquor visitable) {
		return visitable.getPrice() * .10 + visitable.getPrice();
	}
}
