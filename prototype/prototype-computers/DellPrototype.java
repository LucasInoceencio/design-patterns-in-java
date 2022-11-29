package entities;

public abstract class DellPrototype {
	protected double value;
	protected double clock;

	public double getValue() {
		return value;
	}

	public void setValue(double value) {
		this.value = value;
	}

	public double getClock() {
		return clock;
	}

	public void setClock(double clock) {
		this.clock = clock;
	}
	
	public abstract DellPrototype clone();
	
	public abstract String viewInfo();
}
