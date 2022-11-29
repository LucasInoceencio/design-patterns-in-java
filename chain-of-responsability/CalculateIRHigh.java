package entities;

public class CalculateIRHigh extends CalculateIR {

	@Override
	public double calculate(IR ir) {
		double result = ir.getTotalValue() * 0.20;
		System.out.println("Resultado do c�lculo (High): " + result);
		return result;
	}

	@Override
	public void setNext(CalculateIR next) {
	}
}
