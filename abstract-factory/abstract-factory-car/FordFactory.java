package entities;

public class FordFactory extends CarFactory {

	public SUV createSUV() {
		return new Edge();
	}
	
	public Hatch createHatch() {
		return new Fiesta();
	}
	
}
