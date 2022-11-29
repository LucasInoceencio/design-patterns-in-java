package entities;

public class Main {

	public static void main(String[] args) {
		
		ChairFactory razerFactory = new RazerFactory();
		
		Chair razer1 = razerFactory.createChair("presidential");
		razer1.viewInfo();
		Chair razer2 = razerFactory.createChair("executive");
		razer2.viewInfo();
		
		ChairFactory multilaserFactory = new MultilaserFactory();
		
		Chair multilaser1 = multilaserFactory.createChair("presidential");
		multilaser1.viewInfo();
		Chair multilaser2 = multilaserFactory.createChair("executive");
		multilaser2.viewInfo();
		
	}

}
