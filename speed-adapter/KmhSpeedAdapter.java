package entities;

public class KmhSpeedAdapter extends MphSpeed {
	@Override
	public void setValue(double value) {
		super.setValue(value / 1.609);
	}
	
	@Override
	public double getValue() {
		return (super.getValue() * 1.609);
	}
	
	public double getValueMph() {
		return super.getValue();
	}
}
