package PracSet1;

import java.util.Scanner;

public class Rectangle {

	static Scanner kb = new Scanner(System.in);

	public static void main(String[] args) 
	{
		double length; // rectangle length
		double width; // rectangle width
		double area; // rectangle area
		double perimeter; // rectangle perimeter

// Obtain and validate the rectangle's dimensions
		System.out.println("Enter the rectangle's dimensions. You will need to enter the length and the width in cm.");

		System.out.print("Enter the length of the rectangle : ");
		length = kb.nextDouble();
		length = validateNumber(length);

		System.out.print("Enter the width of the rectangle : ");
		width = kb.nextDouble();
		width = validateNumber(width);

// Calculate the rectangle's area and perimeter
		area = calculateArea(length, width);
		perimeter = calculatePerimeter(length, width);

// Display the rectangle data.
		displayData(length, width, area, perimeter);

	}

	private static double validateNumber(double length) 
	{
		while (!(length > 0)) 
		{
			System.out.println("invalid value, pls enter a positive value");
			length = kb.nextDouble();
		}
		return length;
	}

	private static double calculateArea(double length, double width) 
	{
		double area; // rectangle area
		area = length * width;
		System.out.println(area);
		return area;
	}

	private static double calculatePerimeter(double length, double width) 
	{
		double perimeter; // rectangle perimeter
		perimeter = (2 * length + 2 * width);
		System.out.println(perimeter);
		return perimeter;
	}

	private static void displayData(double length, double width, double area, double perimeter) 
	{
		System.out.println("Length: " + length);
		System.out.println("Width: " + width);
		System.out.println("Area: " + area);
		System.out.println("Perimeter: " + perimeter);
	}

}
