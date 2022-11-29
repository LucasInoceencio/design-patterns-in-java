package entities;

public class CarFactory {
	
	public Car getCar(String model) {
		if (model == null) {
			return null;
		}
		if (model.equalsIgnoreCase("208")) {
			return new P208();
		} else if (model.equalsIgnoreCase("3008")) {
			return new P3008();
		} else if (model.equalsIgnoreCase("EDGE")) {
			return new Edge();
		} else if (model.equalsIgnoreCase("FIESTA")) {
			return new Fiesta();
		}
		return null;
	}

}
