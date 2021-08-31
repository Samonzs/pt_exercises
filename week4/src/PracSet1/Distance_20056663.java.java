package PracSet1;

import java.util.Scanner;

public class DistanceWk4 
{

	public static void main(String[] args) 
	{
		int time;
		String animal;
		double distance;
		double speed1 = 0;
		String animal2;
		double distance2;
		double distancetotal = 0;
		double speed2 = 0;
		double data = 0;

		// Inputs:
		Scanner kb = new Scanner(System.in);
		System.out.println("Time Running: ");
		time = kb.nextInt();
		time = validateTime(time);
		if (!(time < 0 || time > 30)) 
		{

			System.out.println("Animal 1:");
			Scanner kb1 = new Scanner(System.in);
			animal = kb1.nextLine();

			System.out.println("Distance travelled:");
			distance = kb.nextDouble();

			System.out.println("Speed(km/h):" + distance / time);
			speed1 = validateSpeed1(speed1);
			speed1 = distance / time;

			System.out.println("Animal 2:");
			Scanner kb2 = new Scanner(System.in);
			animal2 = kb2.nextLine();

			System.out.println("Distance travelled:");
			distance2 = kb.nextDouble();

			System.out.println("Speed(km/h):" + distance2 / time);
			speed2 = validateSpeed2(speed2);
			speed2 = distance2 / time;

			// Processes:

			distance = calculatdistance(distance, distance2, speed1, time, speed2);
			if (distance < distance2) 
			{
				distancetotal = distance2 / distance;
			} else 
			{
				distancetotal = distance / distance2;
			}
			// Outputs:
			data = displayComparison(distance, distance2, time, animal, animal2, distancetotal, data);

		}
	}

	private static double displayComparison(double distance, double distance2, int time, String animal, String animal2,
			double distancetotal, double data) 
	{
		System.out.println("Time running " + time + " seconds");
		System.out.println("Animal 1: " + animal);
		System.out.println("Distance Travelled: " + distance + " m " + " in " + time + " seconds");
		System.out.println("Animal 2: " + animal2);
		System.out.println("Distance Travelled: " + distance2 + " m " + " in " + time + " seconds");
		if (distance > distance2) 
		{
			System.out.println(
					"The " + animal + " runs " + distancetotal + " times as far as the " + animal2 + " in 30 seconds.");
		} else 
		{
			System.out.println(
					"The " + animal2 + " runs " + distancetotal + " times as far as the " + animal + " in 30 seconds.");
		}
		return data;
	}

	private static double calculatdistance(double speed1, double distance, double speed2, double distance2,
			double time) 
	{

		distance = speed1 * time;
		distance2 = speed2 * time;

		return distance;
	}

	private static double validateSpeed1(double speed1) 
	{
		while (speed1 > 0) 
		{ // speed validation, however the validation shouldnt have to execute since the
			// time has been validated appropriately
			System.out.println("this number is invalid, re enter time and distances");

		}
		return speed1;
	}

	private static double validateSpeed2(double speed2) 
	{
		while (speed2 > 0) 
		{ // speed validation, however the validation shouldnt have to execute since the
			// time has been validated appropriately
			System.out.println("this number is invalid, re enter time and distances");

		}
		return speed2;

	}

	private static int validateTime(int time) 
	{
		Scanner kb = new Scanner(System.in);
		while (time < 0 || time > 30) 
		{
			System.out.println("please enter a time that is between 0 and 30"); // validation of time running
			time = kb.nextByte();
		}
		return time;

	}

}