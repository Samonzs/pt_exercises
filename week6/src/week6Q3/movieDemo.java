package week6Q3;


import java.io.ObjectInputStream.GetField;

import java.util.Scanner;

/**
 * Week 5 practical code. Not to be used without permission and appropriate
 * referencing
 */
// Question 1 e) the code will execute normally ,  the functionality and outputs are different due to the assignable values we have newly stored from part d
// the code will execute normally , however we have set values that restore those values(ID,fname,sname,rate)  since we have set them according to user inputs.
// in the code for the accountant objects data fields, it is different from week5 data as we did notn assign them to anything, however in this case we have done so
// , so the code does change the initial data field. the display method in the employee class showcases the data values that are assigned before the user input implementation
// once the user inputs their data accordingly, the data then is updated to the inputted data. 
public class movieDemo 
{
	public static void main(String[] args) 
	{
		movieClass movie = new movieClass();

		Scanner kb = new Scanner(System.in);
		
		
		System.out.println("year realease of movie: ");
		int year = kb.nextInt();
		while(!(year > 1920)) 
		{
			System.out.println("the year has to be greater then 1920");  
			year = kb.nextInt();
		}
		movie.setYearReleased(year);

		System.out.println("title of the movie: ");
		String title = kb.nextLine();
		title = kb.nextLine();
		movie.setTitle(title);

		System.out.println("Rating of the movie: ");
		String rating = kb.nextLine();
		while (!(rating.equals("G")) && !rating.equals("PG") && !rating.equals("M") && !rating.equals("MA") && !rating.equals("R"))
		{
			System.out.println("Please enter a rating of the following: 'G, PG, M, MA, R' ");
			rating = kb.nextLine();
		}
		movie.setRating(rating);

		System.out.println("Lead Actor: ");
		String leadActor = kb.nextLine();
		movie.setLeadActor(leadActor);

		System.out.println("Production Company: ");
		String productionCompany= kb.nextLine();
		movie.setProductionCompany(productionCompany);

		System.out.println("Gross Box Office: ");
		int grossBoxOffice = kb.nextInt();
		while(grossBoxOffice < 0) 
		{
			System.out.println("gross box office has to be greater then $0.00");
			grossBoxOffice = kb.nextInt();
		}
		movie.setGrossBoxOffice(grossBoxOffice);
		
		
		
		
		
		
		
		// second movie  of the playlist:
		movieClass movie2 = new movieClass(year, title, rating, leadActor, productionCompany, grossBoxOffice);
		
		
		
		
	
		System.out.println("year realease of movie: ");
		year = kb.nextInt();
		while(!(year > 1920)) 
		{
			System.out.println("the year has to be greater then 1920");  
			year = kb.nextInt();
		}
		movie2.setYearReleased(year);

		System.out.println("title of the movie: ");
		title = kb.nextLine();
		title = kb.nextLine();
		movie2.setTitle(title);

		System.out.println("Rating of the movie: ");
		rating = kb.nextLine();
		while (!(rating.equals("G")) && !rating.equals("PG") && !rating.equals("M") && !rating.equals("MA") && !rating.equals("R"))
		{
			System.out.println("Please enter a rating of the following: 'G, PG, M, MA, R' ");
			rating = kb.nextLine();
		}
		movie2.setRating(rating);

		System.out.println("Lead Actor: ");
		leadActor = kb.nextLine();
		movie2.setLeadActor(leadActor);

		System.out.println("Production Company: ");
		productionCompany = kb.nextLine();
		movie2.setProductionCompany(productionCompany);

		System.out.println("Gross Box Office: ");
		grossBoxOffice = kb.nextInt();
		while(grossBoxOffice < 0) 
		{
			System.out.println("gross box office has to be greater then $0.00");
			grossBoxOffice = kb.nextInt();
		}
		movie2.setGrossBoxOffice(grossBoxOffice);
		
		
		
		
		
		//third movie of the playlsit:
		
		movieClass movie3 = new movieClass(year,title, rating, leadActor, productionCompany, grossBoxOffice);
		
		
		
		
		
		System.out.println("year realease of movie: ");
		year = kb.nextInt();
		while(!(year > 1920)) 
		{
			System.out.println("the year has to be greater then 1920");  
			year = kb.nextInt();
		}
		movie3.setYearReleased(year);

		System.out.println("title of the movie: ");
		title = kb.nextLine();
		title = kb.nextLine();
		movie3.setTitle(title);

		System.out.println("Rating of the movie: ");
		rating = kb.nextLine();
		while (!(rating.equals("G")) && !rating.equals("PG") && !rating.equals("M") && !rating.equals("MA") && !rating.equals("R"))
		{
			System.out.println("Please enter a rating of the following: 'G, PG, M, MA, R' ");
			rating = kb.nextLine();
		}
		movie3.setRating(rating);

		System.out.println("Lead Actor: ");
		leadActor = kb.nextLine();
		movie3.setLeadActor(leadActor);

		System.out.println("Production Company: ");
		productionCompany = kb.nextLine();
		movie3.setProductionCompany(productionCompany);

		System.out.println("Gross Box Office: ");
		grossBoxOffice = kb.nextInt();
		while(grossBoxOffice < 0) 
		{
			System.out.println("gross box office has to be greater then $0.00");
			grossBoxOffice = kb.nextInt();
		}
		movie3.setGrossBoxOffice(grossBoxOffice);
		
		

		
		
		
		
		System.out.println("Year Released\t  "+ "Title\t\t"+"Rating\t\t"+"Lead Actor\t"+"Production Company\t"+"Gross Box Office\t"  );
		System.out.println("------------------------------------------------------------------------------------------------------");
		System.out.printf("\n%-10s %-10s %-10s %-10s %-10s %-10s",movie.getYearReleased()+"\t\t" , movie.getTitle()+"\t", movie.getRating()+"\t", movie.getLeadActor()+"\t\t",movie.getProductionCompany()+"\t\t", movie.getGrossBoxOffice()+"\t");
		System.out.printf("\n%-10s %-10s %-10s %-10s %-10s %-10s",movie2.getYearReleased()+"\t\t" , movie2.getTitle()+"\t ", movie2.getRating()+"\t ", movie2.getLeadActor()+"\t\t",movie2.getProductionCompany()+"\t\t", movie2.getGrossBoxOffice());
		System.out.printf("\n%-10s %-10s %-10s %-10s %-10s %-10s",movie3.getYearReleased()+"\t\t" , movie3.getTitle()+"\t ", movie3.getRating()+"\t ", movie3.getLeadActor()+"\t\t",movie3.getProductionCompany()+"\t\t", movie3.getGrossBoxOffice());


		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
