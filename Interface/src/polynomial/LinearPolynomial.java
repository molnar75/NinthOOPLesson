package polynomial;

import math.Polynomial;

public class LinearPolynomial implements Polynomial {

	double a;
	double b;
	
	
	public LinearPolynomial(double a, double b) {
		super();
		this.a = a;
		this.b = b;
	}
	
	public double calculate(double x) {
		return (a*x+b);
	}
	public int getDegree() {
		return 1;
	}

	public String toString() {
		return "LinearPolynomial y=" + a + "x+(" + b + ")";
	}
	
}
