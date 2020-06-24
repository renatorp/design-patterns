package visitor;

public interface TaxVisitable {
	double accept(TaxVisitor visitor);
}
