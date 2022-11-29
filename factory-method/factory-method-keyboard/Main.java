package entities;

public class Main {

	public static void main(String[] args) {
		
		IKeyboardFactory logitechFactory = new LogitechFactory();
		
		IKeyboard logitech1 = logitechFactory.createKeyboard("mechanic");
		logitech1.viewInfo();
		IKeyboard logitech2 = logitechFactory.createKeyboard("membrane");
		logitech2.viewInfo();
		
		IKeyboardFactory corsairFactory = new CorsairFactory();
		
		IKeyboard corsair1 = corsairFactory.createKeyboard("mechanic");
		corsair1.viewInfo();
		IKeyboard corsair2 = corsairFactory.createKeyboard("membrane");
		corsair2.viewInfo();

	}

}
