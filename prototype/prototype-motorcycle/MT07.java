package entities;

public class MT07 extends YamahaPrototype {

	protected MT07(MT07 motoMT07) {
		this.value = motoMT07.getValue();
		this.color = motoMT07.getColor();
	}
	
	public MT07() {
		value = 0;
		color = "";
	}
	
	@Override
	public String viewInfo() {
		return "Modelo: MT07\nMontadora: Yamaha\n" + "Valor: R$ " + getValue() + "\nCor: " + getColor() + "\n";
	}
	
	@Override
	public YamahaPrototype clone() {
		return new MT07(this);
	}
}
