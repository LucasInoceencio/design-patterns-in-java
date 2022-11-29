package entities;

public class PenFactory {
	
	public IPen getPen(String model) {
		if (model == null) {
			return null;
		}
		if (model.equalsIgnoreCase("CRISTAL")) {
			return new Cristal();
		} else if (model.equalsIgnoreCase("INTENSITY")) {
			return new Intensity();
		} else if (model.equalsIgnoreCase("SENATOR")) {
			return new Senator();
		} else if (model.equalsIgnoreCase("SWAROVSKI")) {
			return new Swarovski();
		}
		return null;
	}

}
