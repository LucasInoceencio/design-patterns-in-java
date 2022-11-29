package entities;

public class BovineHamburger extends HamburgerBuilder {

	public void buildBread() {
		hamburger.setBread("Brioche");
	}
	
	public void buildMeat() {
		hamburger.setMeat("Bovina");
	}
	
	public void buildSauce() {
		hamburger.setSauce("Barbecue");
	}
	
}
