package entities;

public class CalculateIRLow extends CalculateIR {
	private CalculateIR next;

	@Override
	public double calculate(IR ir) {
		if(ir.getTotalValue() <= 5000) {
			double result = ir.getTotalValue() * 0.10;
			System.out.println("Resultado do cálculo (Low): " + result);
			return result;
		}
		else {
			return next.calculate(ir);
		}
	}

	@Override
	public void setNext(CalculateIR next) {
		this.next = next;
	}
}
