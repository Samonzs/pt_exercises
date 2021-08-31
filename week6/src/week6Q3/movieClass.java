package week6Q3;

import java.util.Scanner;

public class movieClass {
	Scanner kb = new Scanner(System.in);

// first movie input variables
	private int yearReleased;
	private String Title;
	private String Rating;
	private String LeadActor;
	private String ProductionCompany;
	private int GrossBoxOffice;

	public movieClass(int year, String title, String rating, String leadActor, String productionCompany,
			int grossBoxOffice) {

		year = yearReleased;
		title = Title;
		rating = Rating;
		leadActor = LeadActor;
		productionCompany = ProductionCompany;
		grossBoxOffice = GrossBoxOffice;
	}

	public movieClass() {
		// first movie constructor
	}

	public void setYearReleased(int year) {
		yearReleased = year;

	}

	public int getYearReleased() {

		return yearReleased;
	}

	public void setTitle(String title) {
		Title = title;

	}

	public String getTitle() {

		return Title;
	}

	public void setRating(String rating) {
		Rating = rating;

	}

	public String getRating() {

		return Rating;
	}

	public void setLeadActor(String leadActor) {
		LeadActor = leadActor;
	}

	public String getLeadActor() {

		return LeadActor;

	}

	public void setProductionCompany(String productionCompany) {
		ProductionCompany = productionCompany;
	}

	public String getProductionCompany() {
		return ProductionCompany;
	}

	public void setGrossBoxOffice(int grossBoxOffice) {

		GrossBoxOffice = grossBoxOffice;

	}

	public int getGrossBoxOffice() {

		return GrossBoxOffice;
	}

}