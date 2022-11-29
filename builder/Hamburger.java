package entities;

public class Hamburger {
	
	private String bread = "";
	private String meat = "";
	private String sauce = "";
	
	public void setBread(String bread) {
		this.bread = bread;
	}
	public void setMeat(String meat) {
		this.meat = meat;
	}
	public void setSauce(String sauce) {
		this.sauce = sauce;
	}
	
	@Override
	public String toString() {
		return "Hamburger [bread=" + bread + ", meat=" + meat + ", sauce=" + sauce + "]";
	}
	
}
