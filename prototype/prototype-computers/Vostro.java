package entities;

public class Vostro extends DellPrototype {

	protected Vostro(Vostro desktopVostro) {
		this.value = desktopVostro.getValue();
		this.clock = desktopVostro.getClock();
	}
	
	public Vostro() {
		value = 0;
		clock = 0;
	}

	@Override
	public String viewInfo() {
		return "Modelo: Desktop Vostro\nMontadora: Dell\n" + "Valor: R$ " + getValue() + "\nClock: " + getClock() + " GHz\n";
	}
	
	@Override
	public DellPrototype clone() {
		return new Vostro(this);
	}
	
}
