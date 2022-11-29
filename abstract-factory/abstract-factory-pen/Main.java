package entities;

public class Main {

	public static void main(String[] args) {
		IPenFactory bicFac = new BicFactory();
		IBallpointPen pen1 = bicFac.createBallpointPen();
		pen1.viewInfo();
		
		IPenFactory compactorFac = new CompactorFactory();
		IBallpointPen pen2 = compactorFac.createBallpointPen();
		pen2.viewInfo();
		
		IRollerballPen pen3 = bicFac.createRollerballPen();
		pen3.viewInfo();
		
		IRollerballPen pen4 = compactorFac.createRollerballPen();
		pen4.viewInfo();
	}

}
