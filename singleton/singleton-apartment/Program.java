package application;

import entities.ApartmentSingleton;

public class Program {
	public static void main(String[] args) {
		scheduleApartment("A101");
		scheduleApartment("A101");
	}
	
	private static void scheduleApartment(String apartment) {
		ApartmentSingleton apartSingleton = ApartmentSingleton.getInstance();
		System.out.println(apartSingleton.bookApartment(apartment));
	}
}
