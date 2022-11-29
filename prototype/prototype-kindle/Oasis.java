package entities;

public class Oasis extends AmazonPrototype {
	
	protected Oasis(Oasis kindleOasis) {
		this.value = kindleOasis.getValue();
		this.waterResistence = kindleOasis.isWaterResistence();
	}
	
	public Oasis() {
		value = 0;
		waterResistence = false;
	}
	
	@Override
	public String viewInfo() {
		return "Modelo: Oasis\nFabricante: Amazon\n" + "Valor: R$ " + getValue() + "\nResistencia a Agua: " + isWaterResistence() + "\n";
	}
	
	@Override
	public AmazonPrototype clone() {
		return new Oasis(this);
	}
}
