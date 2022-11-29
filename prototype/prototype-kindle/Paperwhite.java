package entities;

public class Paperwhite extends AmazonPrototype{

	protected Paperwhite(Paperwhite kindlePaperwhite) {
		this.value = kindlePaperwhite.getValue();
		this.waterResistence = kindlePaperwhite.isWaterResistence();
	}
	
	public Paperwhite() {
		value = 0;
		waterResistence = false;
	}
	
	@Override
	public String viewInfo() {
		return "Modelo: Oasis\nFabricante: Amazon\n" + "Valor: R$ " + getValue() + "\nResistencia a Agua: " + isWaterResistence() + "\n";
	}
	
	@Override
	public AmazonPrototype clone() {
		return new Paperwhite(this);
	}
	
}
