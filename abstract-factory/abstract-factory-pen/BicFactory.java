package entities;

public class BicFactory implements IPenFactory{
	public IBallpointPen createBallpointPen() {
		return new Cristal();
	}
	
	public IRollerballPen createRollerballPen() {
		return new Intensity();
	}
}
