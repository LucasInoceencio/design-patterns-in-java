package entities;

public abstract class AmazonPrototype {
	protected double value;
	protected boolean waterResistence;
	
	public double getValue() {
		return value;
	}
	public void setValue(double value) {
		this.value = value;
	}
	public boolean isWaterResistence() {
		return waterResistence;
	}
	public void setWaterResistence(boolean waterResistence) {
		this.waterResistence = waterResistence;
	}
	
	public abstract AmazonPrototype clone();
	
	public abstract String viewInfo();
	
}
