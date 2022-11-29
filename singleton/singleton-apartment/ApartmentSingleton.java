package entities;

import java.util.HashSet;
import java.util.Set;

public class ApartmentSingleton {
	private static ApartmentSingleton instance;
	private Set<String>apartmentsAvailable;
	
	private ApartmentSingleton() {
		this.apartmentsAvailable = new HashSet<>();
		apartmentsAvailable.add("A101");
		apartmentsAvailable.add("B204");
	}
	
	public static ApartmentSingleton getInstance() {
		if(instance == null) {
			synchronized (ApartmentSingleton.class) {
				if(instance == null) {
					instance = new ApartmentSingleton();
				}
			}
		}
		
		return instance;
	}
	
	public boolean bookApartment(String apartment) {
		return apartmentsAvailable.remove(apartment);
	}
}
