package application;

import entities.Attendant;
import entities.BovineHamburger;
import entities.Hamburger;
import entities.HamburgerBuilder;

public class Program {

	public static void main(String[] args) {
		Attendant attendant = new Attendant();
		HamburgerBuilder bovineHamburger = new BovineHamburger();
		
		bovineHamburger.createNewHamburger();
		attendant.setHamburgerBuilder(bovineHamburger);
		attendant.constructHamburger();
		
		Hamburger productHamburger = attendant.getHamburger();
		
		System.out.println(productHamburger);
	}
	
}
