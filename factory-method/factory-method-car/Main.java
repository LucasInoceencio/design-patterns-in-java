package entities;

public class Main {

	public static void main(String[] args) {
		
		CarFactory fordFactory = new FordFactory();
		Car ford1 = fordFactory.createCar("SUV");
		ford1.viewInfo();
		Car ford2 = fordFactory.createCar("Hatch");
		ford2.viewInfo();
		
		CarFactory peugeotFactory = new PeugeotFactory();
		Car peugeot1 = peugeotFactory.createCar("SUV");
		peugeot1.viewInfo();
		Car peugeot2 = peugeotFactory.createCar("Hatch");
		peugeot2.viewInfo();
	}

}
