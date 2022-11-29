package entities;

public class MultilaserFactory extends ChairFactory {

	public Chair createChair(String type) {
		if (type == null) {
			return null;
		}
		if (type.equalsIgnoreCase("EXECUTIVE")) {
			return new ExecutiveMultilaser();
		} else if (type.equalsIgnoreCase("PRESIDENTIAL")) {
			return new PresidentialMultilaser();
		}
		return null;
	}
}
