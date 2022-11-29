package application;

import entities.AmazonPrototype;
import entities.Oasis;
import entities.Paperwhite;

public class Program {

	public static void main(String[] args) {
		Oasis prototypeAmazon1 = new Oasis();
		Paperwhite prototypeAmazon2 = new Paperwhite();
		
		AmazonPrototype novoKindleOasis = prototypeAmazon1.clone();
		novoKindleOasis.setValue(1299);
		novoKindleOasis.setWaterResistence(true);
		System.out.println(novoKindleOasis.viewInfo());
		
		AmazonPrototype usadoKindleOasis = prototypeAmazon1.clone();
		usadoKindleOasis.setValue(899);
		usadoKindleOasis.setWaterResistence(true);
		System.out.println(usadoKindleOasis.viewInfo());
		
		AmazonPrototype novoKindlePaperWhite = prototypeAmazon2.clone();
		novoKindlePaperWhite.setValue(699);
		novoKindlePaperWhite.setWaterResistence(false);
		System.out.println(novoKindlePaperWhite.viewInfo());
		
		AmazonPrototype usadoKindlePaperWhite = prototypeAmazon2.clone();
		usadoKindlePaperWhite.setValue(399);
		usadoKindlePaperWhite.setWaterResistence(false);
		System.out.println(usadoKindlePaperWhite.viewInfo());
	}

}
