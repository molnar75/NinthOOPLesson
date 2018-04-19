package polynomial;

import math.Polynomial;

public class Test {

	public static void main(String[] args) {
		Polynomial[] polyArray = new LinearPolynomial[5];
		for(int i=0; i < polyArray.length; i++){
			polyArray[i] = new LinearPolynomial(i+1, i+4);
		}
		
		for (Polynomial polynomial : polyArray) {
			System.out.println(polynomial);
		}
		
		getTable(polyArray[polyArray.length-1]);
	}
	
	public static void getTable(Polynomial polynomial){
		for(int i=0; i<11; i++){
			System.out.println("x="+(i*0.1)+" then y="+polynomial.calculate(i*0.1));
		}
	}
}
