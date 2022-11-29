package enums;

import java.util.HashSet;
import java.util.Set;

public enum ApartmentSingletonEnum {
	INSTANCE;
	
	private Set<String>apartmentsAvailable;
	
	ApartmentSingletonEnum() {
		this.apartmentsAvailable = new HashSet<>();
		apartmentsAvailable.add("A101");
		apartmentsAvailable.add("B204");
	}
	
	public boolean bookApartment(String apartment) {
		return apartmentsAvailable.remove(apartment);
	}
	
	public static void scheduleApartment(String apartment) {
		ApartmentSingletonEnum apartSingleton = ApartmentSingletonEnum.INSTANCE;
		System.out.println(apartSingleton.bookApartment(apartment));
	}
}
