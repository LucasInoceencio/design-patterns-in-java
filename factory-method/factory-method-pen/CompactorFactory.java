package entities;

public class CompactorFactory implements IPenFactory {

	public IPen createPen(String type) {
		if (type == null) {
			return null;
		}
		if (type.equalsIgnoreCase("Ballpoint")) {
			return new Senator();
		} else if (type.equalsIgnoreCase("Rollerball" )) {
			return new Swarovski();
		}
		return null;
	}
	
}
