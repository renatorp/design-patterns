package visitor;

import java.text.DecimalFormat;

public class Main {

	private static DecimalFormat df = new DecimalFormat("##.#");

	public static void main(String[] args) {
		TaxVisitor taxCalculator = new TaxCalculator();
		TaxVisitor taxHolidayCalculator = new TaxHolidayCalculator();

		Necessity milk = new Necessity(3.47);
		Liquor vodka = new Liquor(11.99);
		Tobacco cigars = new Tobacco(19.99);

		System.out.println(" --WORKDAY PRICES-- ");
		System.out.println("Milk: " + df.format(milk.accept(taxCalculator)));
		System.out.println("Cigars: " + df.format(cigars.accept(taxCalculator)));
		System.out.println("Vodka: " + df.format(vodka.accept(taxCalculator)));
		System.out.println();

		System.out.println(" --HOLIDAY PRICES-- ");
		System.out.println("Milk: " + df.format(milk.accept(taxHolidayCalculator)));
		System.out.println("Cigars: " + df.format(cigars.accept(taxHolidayCalculator)));
		System.out.println("Vodka: " + df.format(vodka.accept(taxHolidayCalculator)));

	}




}
