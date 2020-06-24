package visitor;

/**
 * Represent an operation to be performed on the elements of an object structure. Visitor lets you define a new operation without changing the classes of the elements on which it operates.
 *
 * Applicability:
 * Many distinct and unrelated operations need to be performed on node objects in a heterogeneous aggregate structure. You want to avoid "polluting" the node classes with these operations. And, you don't want to have to query the type of each node and cast the pointer to the correct type before performing the desired operation.
 *
 * Benefits:
 *  - Add functions to class libraries for which you either do not have the source or cannot change the source
 *  - Obtain data from a disparate collection of unrelated classes and use it to present the results of a global calculation to the user program
 *  - Gather related operations into a single class rather than force you to change or derive classes to add these operations
 */
public interface TaxVisitor {

	// visit is the pattern related name, but here it could be calculatePrice
	double visit(Tobacco visitable);
	double visit(Necessity visitable);
	double visit(Liquor visitable);
}
