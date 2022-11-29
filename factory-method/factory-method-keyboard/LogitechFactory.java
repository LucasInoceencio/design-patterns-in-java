package entities;

public class LogitechFactory implements IKeyboardFactory {
	
	public IKeyboard createKeyboard(String type) {
		if (type == null) {
			return null;
		}
		if (type.equalsIgnoreCase("MECHANIC")) {
			return new MechanicLogitech();
		} else if (type.equalsIgnoreCase("MEMBRANE")) {
			return new MembraneLogitech();
		}
		return null;
	}

}
