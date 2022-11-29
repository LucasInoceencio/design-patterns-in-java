package entities;

public class PeugeotFactory extends CarFactory{

	public SUV createSUV() {
		return new P3008();
	}
	
	public Hatch createHatch() {
		return new P208();
	}
	
}
