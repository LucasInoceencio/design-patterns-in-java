package entities;

public abstract class CalculateIR {
	public abstract double calculate(IR ir);
	public abstract void setNext (CalculateIR next);
}
