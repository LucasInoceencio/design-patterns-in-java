package entities;

public class XPS extends DellPrototype {
	
	protected XPS(XPS notebookXPS) {
		this.value = notebookXPS.getValue();
		this.clock = notebookXPS.getClock();
	}
	
	public XPS() {
		value = 0;
		clock = 0;
	}

	@Override
	public String viewInfo() {
		return "Modelo: Notebook XPS\nMontadora: Dell\n" + "Valor: R$ " + getValue() + "\nClock: " + getClock() + " GHz\n";
	}
	
	@Override
	public DellPrototype clone() {
		return new XPS(this);
	}
}
