package entities;

public class RazerFactory extends ChairFactory {
	
	public Chair createChair (String type) {
		if (type == null) {
			return null;
		}
		if (type.equalsIgnoreCase("EXECUTIVE")) {
			return new ExecutiveRazer();
		} else if (type.equalsIgnoreCase("PRESIDENTIAL" )) {
			return new PresidentialRazer();
		} 
		return null;
	}
	
}
