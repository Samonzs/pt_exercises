package PracSet1;

import java.util.Scanner;

public class KoalaWk4 {

	public static void main(String[] args) {
		double koalas = 0;
		double percent = 0;
		int years = 0;

		// inputs:

		Scanner kb = new Scanner(System.in);
		koalas = NumberOfKoalas(koalas);
		if (!(500 > koalas)) {
			percent = percentageIncrease(percent);
			if (!(2 < percent)) {
				years = numberOfYears(years);
				if (!(10 > years)) {
					// process:
					koalas = populationIncrease(years, percent, koalas);
					}

				}

			}
		}

	private static double populationIncrease(double years, double percent, double koalas) {
		for (int i = 0; i < years; i++) {
			koalas = koalas * percent;
			System.out.println("by the end of year " + (i + 1) + " there will be " + (int) koalas + " koalas ");
	}
		return koalas;

	}

	private static int numberOfYears(int years) {
		Scanner kb = new Scanner(System.in);
		System.out.println("Number of years: ");
		years = kb.nextInt();		
		return years ;
	}

	private static double percentageIncrease(double percent) {
		Scanner kb = new Scanner(System.in);
		System.out.println("Average annual population increase: ");
		percent = kb.nextDouble();
		return percent;
	}

	private static double NumberOfKoalas(double koalas) {
		Scanner kb = new Scanner(System.in);
		System.out.println("Starting number of koalas: ");
		koalas = kb.nextInt();
		return koalas;

	}
	
	
}