package entities;

public class Main {

	public static void main(String[] args) {
		
		CarFactory fordFactory = new FordFactory();
		SUV fordSUV = fordFactory.createSUV();
		Hatch fordHatch = fordFactory.createHatch();
		
		fordSUV.viewInfo();
		fordHatch.viewInfo();
		
		CarFactory peugeotFactory = new PeugeotFactory();
		SUV peugeotSUV = peugeotFactory.createSUV();
		Hatch peugeotHatch = peugeotFactory.createHatch();
		
		peugeotSUV.viewInfo();
		peugeotHatch.viewInfo();
		
	}

}
