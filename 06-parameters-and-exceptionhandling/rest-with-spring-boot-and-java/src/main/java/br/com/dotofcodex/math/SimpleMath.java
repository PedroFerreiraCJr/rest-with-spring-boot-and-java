package br.com.dotofcodex.math;

public class SimpleMath {
	public Double sum(Double numberOne, Double numberTwo) throws Exception {
		return numberOne + numberTwo;
	}

	public Double subtraction(Double numberOne, Double numberTwo) throws Exception {
		return numberOne - numberTwo;
	}

	public Double multiplication(Double numberOne, Double numberTwo) throws Exception {
		return numberOne * numberTwo;
	}

	public Double division(Double numberOne, Double numberTwo) throws Exception {
		return numberOne / numberTwo;
	}

	public Double mean(Double numberOne, Double numberTwo) throws Exception {
		return (numberOne + numberTwo) / 2d;
	}

	public Double squareRoot(Double number) throws Exception {
		return Math.sqrt(number);
	}
}
