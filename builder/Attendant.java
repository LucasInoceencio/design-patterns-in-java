package entities;

public class Attendant {
	
	private HamburgerBuilder hamburgerBuilder;
	
	public void setHamburgerBuilder(HamburgerBuilder hb) {
		hamburgerBuilder = hb;
	}
	
	public Hamburger getHamburger() {
		return hamburgerBuilder.getHamburger();
	}
	
	public void constructHamburger() {
		hamburgerBuilder.createNewHamburger();
		hamburgerBuilder.buildBread();
		hamburgerBuilder.buildMeat();
		hamburgerBuilder.buildSauce();
	}

}
