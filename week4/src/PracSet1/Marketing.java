package PracSet1;

import java.util.Scanner;

public class Marketing 
{

	public static void main(String[] args) 
	{

		double occupancyRate3;
		double occupancyRate2;
		double occupancyRate;
		byte rooms1;
		byte rooms2;
		byte rooms3;
		byte occupied1;
		byte occupied2;
		byte occupied3;

		// inputs:
		Scanner kb = new Scanner(System.in);

		System.out.println("number of rooms for first floor:");
		rooms1 = kb.nextByte();
		if (!(rooms1 < 8 || rooms1 > 18)) 
		{
			System.out.println("number of occupied rooms for first floor:");
			occupied1 = kb.nextByte();
			if (occupied1 <= 18 && occupied1 >= 8) 
			{

				System.out.println("number of rooms for second floor:");
				rooms2 = kb.nextByte();
				if (!(rooms2 < 8 || rooms2 > 18)) 
				{
					System.out.println("number of occupied rooms for second floor:");
					occupied2 = kb.nextByte();
					if (occupied2 < 18 && occupied1 > 8) 
					{

						System.out.println("number of rooms for third floor:");
						rooms3 = kb.nextByte();
						if (!(rooms3 < 8 || rooms3 > 18)) 
						{
							System.out.println("number of occupied rooms for third floor:");
							occupied3 = kb.nextByte();
							if (occupied3 < 18 && occupied3 > 8) 
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

							}
						}
					}
				}
			}
		}
	}
}