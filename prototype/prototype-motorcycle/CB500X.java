package entities;

public class CB500X extends HondaPrototype {
	
	protected CB500X(CB500X motoCB500X) {
		this.value = motoCB500X.getValue();
		this.color = motoCB500X.getColor();
	}
	
	public CB500X() {
		value = 0;
		color = "";
	}
	
	@Override
	public String viewInfo() {
		return "Modelo: CB500X\nMontadora: Honda\n" + "Valor: R$ " + getValue() + "\nCor: " + getColor() + "\n";
	}
	
	@Override
	public HondaPrototype clone() {
		return new CB500X(this);
	}
}
