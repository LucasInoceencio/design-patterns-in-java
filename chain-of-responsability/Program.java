package application;

import entities.CalculateIR;
import entities.CalculateIRHigh;
import entities.CalculateIRLow;
import entities.CalculateIRMedium;
import entities.IR;

public class Program {

	public static void main(String[] args) {
		final IR ir = new IR(10000);
		double result = calculate(ir);
		System.out.println("Resultado direto de Calculate: " + result);
	}

	public static double calculate(IR ir) {
		final CalculateIR calculateLow = new CalculateIRLow();
		final CalculateIR calculateMedium = new CalculateIRMedium();
		final CalculateIR calculateHigh = new CalculateIRHigh();
		
		calculateLow.setNext(calculateMedium);
		calculateMedium.setNext(calculateHigh);
		
		return calculateLow.calculate(ir);
	}
}
