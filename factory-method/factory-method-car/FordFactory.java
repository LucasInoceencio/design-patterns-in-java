package entities; 

public class FordFactory extends CarFactory {

	public Car createCar(String type) {
		if (type == null) {
			return null;
		}
		if (type.equalsIgnoreCase("SUV")) {
			return new Edge();
		} else if (type.equalsIgnoreCase("Hatch")) {
			return new Fiesta();
		}
		return null;
	}
}
