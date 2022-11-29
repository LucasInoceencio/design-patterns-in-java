package entities;

public class Lander extends YamahaPrototype {
	
	protected Lander(Lander motoLander) {
		this.value = motoLander.getValue();
		this.color = motoLander.getColor();
	}
	
	public Lander() {
		value = 0;
		color = "";
	}
	
	@Override
	public String viewInfo() {
		return "Modelo: Lander\nMontadora: Yamaha\n" + "Valor: R$ " + getValue() + "\nCor: " + getColor() + "\n";
	}
	
	@Override
	public YamahaPrototype clone() {
		return new Lander(this);
	}
}
