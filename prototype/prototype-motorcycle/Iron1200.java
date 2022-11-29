package entities;

public class Iron1200 extends HarleyDavidsonPrototype {

	protected Iron1200(Iron1200 motoIron1200) {
		this.value = motoIron1200.getValue();
		this.color = motoIron1200.getColor();
	}
	
	public Iron1200() {
		value = 0;
		color = "";
	}
	
	@Override
	public String viewInfo() {
		return "Modelo: Iron 1200\nMontadora: Harley Davidson\n" + "Valor: R$ " + getValue() + "\nCor: " + getColor() + "\n";
	}
	
	@Override
	public HarleyDavidsonPrototype clone() {
		return new Iron1200(this);
	}
}
