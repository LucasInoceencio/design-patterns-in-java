package entities;

public class PeugeotFactory extends CarFactory {

	public Car createCar(String type) {
		if (type == null) {
			return null;
		}
		if (type.equalsIgnoreCase("SUV")) {
			return new P3008();
		} else if (type.equalsIgnoreCase("Hatch")) {
			return new P208();
		}
		return null;
	}
	
}
