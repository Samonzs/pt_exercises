package PracSet1;

import java.util.Scanner;

public class MarketingWk4 
{

	public static void main(String[] args) 
	{

		double occupancyRate3 = 0;
		double occupancyRate2 = 0;
		double occupancyRate = 0;
		byte rooms1;
		byte rooms2;
		byte rooms3;
		byte occupied1;
		byte occupied2;
		byte occupied3;
		double rateOutput = 0;

		// inputs:
		Scanner kb = new Scanner(System.in);

		System.out.println("number of rooms for first floor:");
		rooms1 = kb.nextByte();
		rooms1 = validateNumberOfFLoors(rooms1);
		if (!(rooms1 < 8 || rooms1 > 18)) 
		{
			System.out.println("number of occupied rooms for first floor:");
			occupied1 = kb.nextByte();
			occupied1 = validateNumberOfOccupiedFLoors(occupied1);
			if (!(occupied1 < 8 || occupied1 > 18)) 
			{

				System.out.println("number of rooms for second floor:");
				rooms2 = kb.nextByte();
				rooms2 = validateNumberOfFLoors2(rooms2);

				if (!(rooms2 < 8 || rooms2 > 18)) 
				{
					System.out.println("number of occupied rooms for second floor:");
					occupied2 = kb.nextByte();
					occupied2 = validateNumberOfOccupiedFLoors2(occupied2);

					if (occupied2 < 16 && occupied1 > 8) 
					{

						System.out.println("number of rooms for third floor:");
						rooms3 = kb.nextByte();
						rooms3 = validateNumberOfFLoors3(rooms3);
						if (!(rooms3 < 8 || rooms3 > 18)) 
						{
							System.out.println("number of occupied rooms for third floor:");
							occupied3 = kb.nextByte();
							occupied3 = validateNumberOfOccupiedFLoors3(occupied3);
							if (occupied3 < 18 && occupied3 >= 8) {
								rateOutput = displayRate(rooms1, rooms2, rooms3, occupancyRate, occupancyRate2,
										occupancyRate3, occupied1, occupied2, occupied3, rateOutput);

							}

						}
					}
				}
			}
		}
	}

	private static double displayRate(byte rooms1, byte rooms2, byte rooms3, double occupancyRate,
			double occupancyRate2, double occupancyRate3, byte occupied1, byte occupied2, byte occupied3,
			double rateOutput) 
	{
		occupancyRate = rooms1 / occupied1;
		occupancyRate2 = rooms2 / occupied2;
		occupancyRate3 = rooms3 / occupied3;

		System.out.println("Occupancy Rate for first floor: " + occupancyRate);
		System.out.println("Occupancy Rate for second floor: " + occupancyRate2);
		System.out.println("Occupancy Rate for third floor: " + occupancyRate3);

		if (occupancyRate < 0.6) 
		{
			System.out.println("2 weeks of marketing should be run for first floor");
		}
		if (occupancyRate2 < 0.6) 
		{
			System.out.println("2 weeks of marketing should be run for second floor");
		}
		if (occupancyRate3 < 0.6) 
		{
			System.out.println("2 weeks of marketing should be run for third floor");
		}
		return rateOutput;
	}

	private static byte validateNumberOfFLoors3(byte rooms3) 
	{
		Scanner kb = new Scanner(System.in);
		while (rooms3 < 8 || rooms3 > 18) 
		{
			System.out.println("Please enter the amount of rooms (between 8 and 18)");
			rooms3 = kb.nextByte();
		}

		return rooms3;
	}

	private static byte validateNumberOfOccupiedFLoors3(byte occupied3) 
	{
		Scanner kb = new Scanner(System.in);
		while (occupied3 < 8 || occupied3 > 18) 
		{
			System.out.println("Please enter the amount of occupied rooms (between 8 and 18)");
			occupied3 = kb.nextByte();
		}
		return occupied3;
	}

	private static byte validateNumberOfOccupiedFLoors2(byte occupied2) 
	{
		Scanner kb = new Scanner(System.in);
		while (occupied2 < 8 || occupied2 > 18) 
		{
			System.out.println("Please enter the amount of occupied rooms (between 8 and 18)");
			occupied2 = kb.nextByte();
		}
		return occupied2;
	}

	private static byte validateNumberOfFLoors2(byte rooms2) 
	{
		Scanner kb = new Scanner(System.in);
		while (rooms2 < 8 || rooms2 > 18) 
		{
			System.out.println("Please enter the amount of rooms (between 8 and 18)");
			rooms2 = kb.nextByte();
		}

		return rooms2;
	}

	private static byte validateNumberOfOccupiedFLoors(byte occupied1) 
	{
		Scanner kb = new Scanner(System.in);
		while (occupied1 < 8 || occupied1 > 18) 
		{
			System.out.println("Please enter the amount of occupied rooms (between 8 and 18)");
			occupied1 = kb.nextByte();
		}
		return occupied1;
	}

	private static byte validateNumberOfFLoors(byte rooms1) 
	{
		Scanner kb = new Scanner(System.in);
		while (rooms1 < 8 || rooms1 > 18) 
		{
			System.out.println("Please enter the amount of rooms (between 8 and 18)");
			rooms1 = kb.nextByte();
		}

		return rooms1;
	}
}