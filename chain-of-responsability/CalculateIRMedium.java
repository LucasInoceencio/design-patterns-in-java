package entities;

public class CalculateIRMedium extends CalculateIR {
	private CalculateIR next;

	@Override
	public double calculate(IR ir) {
		if(ir.getTotalValue() > 5000 && ir.getTotalValue() <= 20000) {
			double result = ir.getTotalValue() * 0.15;
			System.out.println("Resultado do cálculo (Medium): " + result);
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
