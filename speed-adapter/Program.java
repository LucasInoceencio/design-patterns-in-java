package application;

import entities.KmhSpeedAdapter;

public class Program {
	public static void main(String[] args) {
		KmhSpeedAdapter speedAdapter = new KmhSpeedAdapter();
		speedAdapter.setValue(100);
		
		System.out.println("Kilometros por hora: " + speedAdapter.getValue());
		System.out.println("Milhas por hora: " + speedAdapter.getValueMph());
	}
}
