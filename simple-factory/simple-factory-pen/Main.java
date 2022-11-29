package entities;

public class Main {
	public static void main(String[] args) {
		
		PenFactory penFactory = new PenFactory();
		
		IPen pen1 = penFactory.getPen("senator");
		pen1.viewInfo();
		
		IPen pen2 = penFactory.getPen("cristal");
		pen2.viewInfo();
		
		IPen pen3 = penFactory.getPen("intensity");
		pen3.viewInfo();
		
		IPen pen4 = penFactory.getPen("swarovski");
		pen4.viewInfo();
	}
}
