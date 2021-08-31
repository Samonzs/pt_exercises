package PracSet1;

import java.util.Scanner;

public class CylinderVolume 
{

    public static void main2(String[] args) 
    {
		Scanner keyboard = new Scanner(System.in);
		double radius;
		System.out.println("Enter Radius");
		radius = keyboard.nextDouble();
		double height;
		System.out.println("Enter Height");
		height = keyboard.nextDouble();
		System.out.println("Volume = "+ 3.14159*height*radius*radius);
		
	}

}
