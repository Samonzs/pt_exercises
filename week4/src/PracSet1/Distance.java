package PracSet1;

import java.util.Scanner;

public class Distance 
{

	public static void main(String[] args) 
	{
		byte time;
		String animal;
		double distance;
		double speed1;
		String animal2;
		double distance2;
		double distancetotal;
		double speed2;

		// Inputs:
		System.out.println("Time Running: ");
		Scanner kb = new Scanner(System.in);
		time = kb.nextByte();
		if (!(time > 30)) 
		{

			System.out.println("Animal 1:");
			Scanner kb1 = new Scanner(System.in);
			animal = kb1.nextLine();

			System.out.println("Distance travelled:");
			distance = kb.nextDouble();

			System.out.println("Speed(km/h):" + distance / time);
			speed1 = distance / time;

			System.out.println("Animal 2:");
			Scanner kb2 = new Scanner(System.in);
			animal2 = kb2.nextLine();

			System.out.println("Distance travelled:");
			distance2 = kb.nextDouble();

			System.out.println("Speed(km/h):" + distance2 / time);
			speed2 = distance2 / time;

			// Processes:
			distance = speed1 * time;
			distance2 = speed2 * time;
			if (distance < distance2) 
			{
				distancetotal = distance2 / distance;
			} else 
			{
				distancetotal = distance / distance2;
			}
			// Outputs:
			System.out.println("Time running " + time + " seconds");
			System.out.println("Animal 1: " + animal);
			System.out.println("Distance Travelled: " + distance + " m " + " in " + time + " seconds");
			System.out.println("Animal 2: " + animal2);
			System.out.println("Distance Travelled: " + distance2 + " m " + " in " + time + " seconds");
			if (distance > distance2) 
			{
				System.out.println("The " + animal + " runs " + distancetotal + " times as far as the " + animal2
						+ " in 30 seconds.");
			} else 
			{
				System.out.println("The " + animal2 + " runs " + distancetotal + " times as far as the " + animal
						+ " in 30 seconds.");
			}

		}
	}

}