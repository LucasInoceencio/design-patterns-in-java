package entities;

public class Main {

	public static void main(String[] args) {
		
		CarFactory carFactory = new CarFactory();
		
		Car car1 = carFactory.getCar("edge");
		car1.viewInfo();
		
		Car car2 = carFactory.getCar("fiesta");
		car2.viewInfo();
		
		Car car3 = carFactory.getCar("208");
		car3.viewInfo();
		
		Car car4 = carFactory.getCar("3008");
		car4.viewInfo();

	}

}
