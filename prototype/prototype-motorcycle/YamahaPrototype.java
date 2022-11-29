package entities;

public abstract class YamahaPrototype {
	
	protected double value;
	protected String color;

	public double getValue() {
		return value;
	}

	public void setValue(double value) {
		this.value = value;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	public abstract String viewInfo();
	
	public abstract YamahaPrototype clone();
}
