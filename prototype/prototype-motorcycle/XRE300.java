package entities;

public class XRE300 extends HondaPrototype {
	
	protected XRE300(XRE300 motoXRE300) {
		this.value = motoXRE300.getValue();
		this.color = motoXRE300.getColor();
	}
	
	public XRE300() {
		value = 0;
		color = "";
	}
	
	@Override
	public String viewInfo() {
		return "Modelo: XRE300\nMontadora: Honda\n" + "Valor: R$ " + getValue() + "\nCor: " + getColor() + "\n";
	}
	
	@Override
	public HondaPrototype clone() {
		return new XRE300(this);
	}
}
