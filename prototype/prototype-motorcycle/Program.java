package application;

import entities.CB500X;
import entities.FatBob;
import entities.HarleyDavidsonPrototype;
import entities.HondaPrototype;
import entities.Iron1200;
import entities.Lander;
import entities.MT07;
import entities.XRE300;
import entities.YamahaPrototype;

public class Program {

	public static void main(String[] args) {
		CB500X prototypeHonda1 = new CB500X();
		XRE300 prototypeHonda2 = new XRE300();
		
		HondaPrototype novaCB500X = prototypeHonda1.clone();
		novaCB500X.setValue(25690);
		novaCB500X.setColor("Blue");
		System.out.println(novaCB500X.viewInfo());
		
		HondaPrototype usadaCB500X = prototypeHonda1.clone();
		usadaCB500X.setValue(20345);
		usadaCB500X.setColor("Red");
		System.out.println(usadaCB500X.viewInfo());
		
		HondaPrototype novaXRE300 = prototypeHonda2.clone();
		novaXRE300.setValue(22990);
		novaXRE300.setColor("Black");
		System.out.println(novaXRE300.viewInfo());
		
		HondaPrototype usadaXRE300 = prototypeHonda2.clone();
		usadaXRE300.setValue(16790);
		usadaXRE300.setColor("Gray");
		System.out.println(usadaXRE300.viewInfo());
		
		Lander prototypeYamaha1 = new Lander();
		MT07 prototypeYamaha2 = new MT07();
		
		YamahaPrototype novaLander = prototypeYamaha1.clone();
		novaLander.setValue(18900);
		novaLander.setColor("Blue");
		System.out.println(novaLander.viewInfo());
		
		YamahaPrototype usadaLander = prototypeYamaha1.clone();
		usadaLander.setValue(13400);
		usadaLander.setColor("Gray");
		System.out.println(usadaLander.viewInfo());
		
		YamahaPrototype novaMT07 = prototypeYamaha2.clone();
		novaMT07.setValue(33400);
		novaMT07.setColor("Black");
		System.out.println(novaMT07.viewInfo());
		
		YamahaPrototype usadaMT07 = prototypeYamaha2.clone();
		usadaMT07.setValue(27654);
		usadaMT07.setColor("Gray");
		System.out.println(usadaMT07.viewInfo());
		
		FatBob prototypeHarley1 = new FatBob();
		Iron1200 prototypeHarley2 = new Iron1200();
		
		HarleyDavidsonPrototype novaFatBob = prototypeHarley1.clone();
		novaFatBob.setValue(74400);
		novaFatBob.setColor("Black");
		System.out.println(novaFatBob.viewInfo());
		
		HarleyDavidsonPrototype usadaFatBob = prototypeHarley1.clone();
		usadaFatBob.setValue(56400);
		usadaFatBob.setColor("Black");
		System.out.println(usadaFatBob.viewInfo());
		
		HarleyDavidsonPrototype novaIron1200 = prototypeHarley2.clone();
		novaIron1200.setValue(59800);
		novaIron1200.setColor("Red");
		System.out.println(novaIron1200.viewInfo());
		
		HarleyDavidsonPrototype usadaIron1200 = prototypeHarley2.clone();
		usadaIron1200.setValue(46300);
		usadaIron1200.setColor("Gray");
		System.out.println(usadaIron1200.viewInfo());
	}

}
