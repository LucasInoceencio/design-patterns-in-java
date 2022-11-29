package entities;

public class Main {

	public static void main(String[] args) {
		IPenFactory compactorFactory = new CompactorFactory();
		IPen compactor1 = compactorFactory.createPen("ballpoint");
		compactor1.viewInfo();
		IPen compactor2 = compactorFactory.createPen("rollerball");
		compactor2.viewInfo();
		
		IPenFactory bicFactory = new BicFactory();
		IPen bic1 = bicFactory.createPen("ballpoint");
		bic1.viewInfo();
		IPen bic2 = bicFactory.createPen("rollerball");
		bic2.viewInfo();

	}

}
