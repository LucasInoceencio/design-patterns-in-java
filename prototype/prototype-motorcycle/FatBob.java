package entities;

public class FatBob extends HarleyDavidsonPrototype{

	protected FatBob(FatBob motoFatBob) {
		this.value = motoFatBob.getValue();
		this.color = motoFatBob.getColor();
	}
	
	public FatBob() {
		value = 0;
		color = "";
	}
	
	@Override
	public String viewInfo() {
		return "Modelo: Fat Bob\nMontadora: Harley Davidson\n" + "Valor: R$ " + getValue() + "\nCor: " + getColor() + "\n";
	}
	
	@Override
	public HarleyDavidsonPrototype clone() {
		return new FatBob(this);
	}
}
