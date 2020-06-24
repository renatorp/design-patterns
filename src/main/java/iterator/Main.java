package iterator;

public class Main {
	public static void main(String[] args) {
		NumbersList numbersList = new NumbersListImpl(1,2,3,4,5,6,7,8,9);

		for(Iterator iterator = numbersList.evenIterator(); !iterator.isDone();) {
			System.out.println("Next: " + iterator.next() + " CurrItem:" + iterator.currentItem() + " FirstItem:" + iterator.first());
		}


	}
}
