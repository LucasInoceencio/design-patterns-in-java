package entities;

public class IR {
	private double TotalValue;
	
	public IR() {}

	public IR(double totalValue) {
		TotalValue = totalValue;
	}

	public double getTotalValue() {
		return TotalValue;
	}

	public void setTotalValue(double totalValue) {
		TotalValue = totalValue;
	}

	@Override
	public String toString() {
		return "IR [TotalValue=" + TotalValue + "]";
	}
}
