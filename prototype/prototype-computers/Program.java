package application;

import entities.DellPrototype;
import entities.Vostro;
import entities.XPS;

public class Program {

	public static void main(String[] args) {
		Vostro prototypeDell1 = new Vostro();
		XPS prototypeDell2 = new XPS();
		
		DellPrototype novoDesktopVostro = prototypeDell1.clone();
		novoDesktopVostro.setClock(5.69);
		novoDesktopVostro.setValue(4500);
		System.out.println(novoDesktopVostro.viewInfo());
		
		DellPrototype usadoDesktopVostro = prototypeDell1.clone();
		usadoDesktopVostro.setClock(4.69);
		usadoDesktopVostro.setValue(3100);
		System.out.println(usadoDesktopVostro.viewInfo());
		
		DellPrototype novoNotebookXPS = prototypeDell2.clone();
		novoNotebookXPS.setClock(3.58);
		novoNotebookXPS.setValue(6950);
		System.out.println(novoNotebookXPS.viewInfo());
		
		DellPrototype usadoNotebookXPS = prototypeDell2.clone();
		usadoNotebookXPS.setClock(3.2);
		usadoNotebookXPS.setValue(4050);
		System.out.println(usadoNotebookXPS.viewInfo());
	}

}
