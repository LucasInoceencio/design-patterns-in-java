package entities;

public class CorsairFactory implements IKeyboardFactory {

	public IKeyboard createKeyboard(String type) {
		if (type == null) {
			return null;
		}
		if (type.equalsIgnoreCase("MECHANIC")) {
			return new MechanicCorsair();
		} else if (type.equalsIgnoreCase("MEMBRANE")) {
			return new MembraneCorsair();
		}
		return null;
	}
	
}
