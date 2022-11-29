package entities;

public class BicFactory implements IPenFactory {

	public IPen createPen(String type) {
		if (type == null) {
			return null;
		}
		if (type.equalsIgnoreCase("Ballpoint")) {
			return new Cristal();
		} else if (type.equalsIgnoreCase("Rollerball" )) {
			return new Intensity();
		}
		return null;
	}
}
