package entities;

public abstract class HamburgerBuilder {

	protected Hamburger hamburger;
	
	public Hamburger getHamburger() {
		return hamburger;
	}
	
	public void createNewHamburger() {
		hamburger = new Hamburger();
	}
	
	public abstract void buildBread();
	public abstract void buildMeat();
	public abstract void buildSauce();
}
