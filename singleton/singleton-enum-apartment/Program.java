package application;

import enums.ApartmentSingletonEnum;

public class Program {
	public static void main(String[] args) {
		ApartmentSingletonEnum.scheduleApartment("A101");
		ApartmentSingletonEnum.scheduleApartment("A101");
	}
}
